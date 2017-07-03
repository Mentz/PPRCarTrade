/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import EDA.Adm;
import EDA.Comentario;
import EDA.UsuDados;
import EDA.Status;
import EDA.Usuario;
import EDA.Veiculo;
import EDA.VendaVeiculo;
import EDA.Vendedor;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class DAOMemoria implements DAOFacade {
    private Status status;
    private static DAOMemoria instance;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<VendaVeiculo> vendaVeiculos;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Vendedor> vendedores;
    private Usuario usuarioLogado;
    protected Adm admin;
    
    private DAOMemoria(){
        this.admin = new Adm("admin", "admin", "Teste McTestilson", "05050505092", "00000000000", "teste@mctestilsonveiculos.com",
                "R. Cajaé 420, São Paulo SP", new Comentario("Olá"), "011 3434 3434");
        this.status = new Status();
        this.veiculos = new ArrayList<>();
        this.vendaVeiculos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        usuarios.add(new Usuario("teste", "teste", "Testano", "123456789", "6549813616", "teste@sex.com", "rua teste, 666", new EDA.Comentario(""), "4792230226"));
        usuarios.add(new Usuario("usu1", "usu1", "Testador", "987654321", "8465923161", "usu1@sedex.com", "Rua: Carlitos, 333", new EDA.Comentario(""), "4712345678"));
        usuarios.add(new Usuario("usu2", "usu2", "Testadora", "1122334455", "316292495", "usu2@sedex.com", "Rua: Carlitas, 123", new EDA.Comentario(""), "4787654321"));
        this.vendedores = new ArrayList<>();
        
        
        Comentario c = new Comentario();
        c.setComment("");
        Veiculo b1 = new Veiculo(2002, "Carro", "FWW1013", "Tuca", "Verde", c);    
        Veiculo b2 = new Veiculo(1970, "Carrito", "FWY1013", "Avila", "Azul", c);
        Veiculo b3 = new Veiculo(1930, "Carroça", "FWZ1013", "Mentz", "Vermelho", c);
        Veiculo b4 = new Veiculo(1990, "Quase carro", "FWA1013", "Leo", "Roxo", c);
        Veiculo b5 = new Veiculo(2017, "MotoCarExpress", "FWB1013", "Weiss", "Dourado", c);
        UsuDados p1 = new UsuDados("Testano", "123456789", "6549813616", "teste@sex.com", "rua teste, 666", new EDA.Comentario(""), "4792230226");
        UsuDados p2 = new UsuDados("Testador", "987654321", "8465923161", "usu1@sedex.com", "Rua: Carlitos, 333", new EDA.Comentario(), "4712345678");
        UsuDados p3 = new UsuDados("Testadora", "1122334455", "316292495", "usu2@sedex.com", "Rua: Carlitas, 123", new EDA.Comentario(), "4787654321");
        vendaVeiculos.add(new VendaVeiculo(b1, p2, 30000.00, c));
        vendaVeiculos.add(new VendaVeiculo(b2, p3, 20250.50, c));
        vendaVeiculos.add(new VendaVeiculo(b3, p3, 2785.18, c));
        vendaVeiculos.add(new VendaVeiculo(b4, p1, 29999.00, c));
        vendaVeiculos.add(new VendaVeiculo(b5, p2, 675250.02, c));
    }
    
    // Autor: Mentz
    public boolean validarAdm(Adm adm){
        return adm == admin;
    }
    
    //Autor: Felipe Weiss
    @Override
    public void setUsuarioLogado(String username, String password){
        for(Usuario a : usuarios){
            if(a.getLogin().equals(username) && a.getSenha().equals(password)){
                usuarioLogado = a;
                break;
            }
        }
    }
    
    @Override
    public Usuario getUsuarioLogado(){
        return usuarioLogado;
    }
    
    @Override
    public void registrarUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }
    
    
    @Override
    public void registrarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }

    @Override
    public void adicionarVeiculoVendedor(Vendedor vendedor, Veiculo veiculo){
        for(int i = 0; i < vendedores.size(); i++){
            if(vendedores.get(i).equals(vendedor)){
                vendedores.get(i).cadastrarVeiculo(veiculo);
                break;
            }
        }
    }
            
    public void registrarVeiculo(Usuario usuario, Veiculo veiculo)
    {
        veiculos.add(veiculo);
    }
    
    // Autor: Mentz
    //@Override
    @Override
    public Adm getAdm()
    {
        return admin;
    }
    
    // Autor: Mentz
    public boolean alterarRegistro(Veiculo veiculo1, Veiculo veiculo2)
    {
        for(int i = 0; i < veiculos.size(); i++){
            if(veiculos.get(i) == veiculo1){
                veiculos.set(i, veiculo2);
                return true;
            }
        }
        
        return false;
    }
    
    // Autor: Mentz
    public boolean excluirRegistro(Veiculo veiculo)
    {
        for(int i = 0; i < veiculos.size(); i++){
            if(veiculos.get(i) == veiculo){
                veiculos.remove(i);
                return true;
            }
        }
        
        return false;
    }

    // Autor: Mentz
    @Override
    public ArrayList<VendaVeiculo> listaVeiculos(){
        return vendaVeiculos;
    }
    
    // Autor: Mentz
    @Override
    public ArrayList<Usuario> listaUsuarios()
    {
        return usuarios;
    }

    public Object Comentario() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
    public static DAOMemoria getInstance(){
        if(instance == null){
            instance = new DAOMemoria();
        }
        return instance;
    }
    
    @Override
    public void cadastrarUsuario(String login, String senha, String nome, String rg, String cpf, String cartMotorista, String endereco, String telefone, String email){
        usuarios.add(new Usuario(login, senha, cpf, rg, cartMotorista, email, endereco, new Comentario(""), telefone));
    }
    
    @Override
    public Status getStatus(){
        return status;
    }

    @Override
    public void registrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }  
    
    // Author: Arthur
    
    @Override
    public void registrarVenda(VendaVeiculo venda){
        vendaVeiculos.add(venda);
    }    
    
    @Override
    public ArrayList<Vendedor> listaVendedores() {
        return this.vendedores;
    }
    
    //Autor: Felipe Weiss
    @Override
    public void adicionarComentarioUsuario(UsuDados proprietario, String comentario){
        int idx = 0;
        for(Usuario a : usuarios){
            if(a.getCpf().equals(proprietario.getCpf())){
                usuarios.get(idx).getComentUsu().setComment(comentario);
                break;
            }
            idx++;
        }
    }
    
    @Override
    public void adicionarComentarioVeiculo(VendaVeiculo veiculo, String comentario){
        int idx = vendaVeiculos.indexOf(veiculo);
        vendaVeiculos.get(idx).setComentarios(new Comentario(comentario));
    }
}