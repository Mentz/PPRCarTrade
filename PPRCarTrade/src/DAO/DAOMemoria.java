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
    protected Adm admin;
    
    private DAOMemoria(){
        this.admin = new Adm("admin", "admin", "Teste McTestilson", "05050505092", 12, "teste@mctestilsonveiculos.com",
                "R. Cajaé 420, São Paulo SP", new Comentario("Olá"), "011 3434 3434");
        this.status = new Status();
        this.veiculos = new ArrayList<>();
        this.vendaVeiculos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        usuarios.add(new Usuario("teste", "teste", "Testano Programsilva", "00000000000", 0, "teste@sex.com", "rua teste, 666", new EDA.Comentario("é só um teste"), "4792230226"));
        this.vendedores = new ArrayList<>();
        
        
        Comentario c = new Comentario();
        c.setComment("oi");
        Veiculo b1 = new Veiculo(2015, "Exemplo1", "FWW1013", "Exemplo5", "Verde", c);    
        Veiculo b2 = new Veiculo(2013, "Exemplo2", "FWY1013", "Exemplo4", "Azul", c);
        Veiculo b3 = new Veiculo(2011, "Exemplo3", "FWZ1013", "Exemplo3", "Vermelho", c);
        Veiculo b4 = new Veiculo(2002, "Exemplo4", "FWA1013", "Exemplo2", "Roxo", c);
        Veiculo b5 = new Veiculo(2011, "Exemplo5", "FWB1013", "Exemplo1", "Dourado", c);
        UsuDados p1 = new UsuDados("FF", "120", 5, "as", "as", c, "asas");
        vendaVeiculos.add(new VendaVeiculo(b1, p1, 25555.33, c));
        vendaVeiculos.add(new VendaVeiculo(b2, p1, 10000.33, c));
        vendaVeiculos.add(new VendaVeiculo(b3, p1, 5626.33, c));
        vendaVeiculos.add(new VendaVeiculo(b4, p1, 300000.33, c));
        vendaVeiculos.add(new VendaVeiculo(b5, p1, 132000.33, c));
    }
    
    // Autor: Mentz
    public boolean validarAdm(Adm adm){
        return adm == admin;
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
            
    public void registrarVeiculo(Usuario usuario, Veiculo veiculo)
    {
        veiculos.add(veiculo);
    }
    
    // Autor: Mentz
    //@Override
    @Override
    public Adm login(String login, String senha)
    {
        if (login.equals(admin.getLogin()) && senha.equals(admin.getSenha()))
            return admin;
        return null;
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
     public boolean checaCadastro(String nome, String rg, String cpf, String telefone, String email){
        if(nome.length() <=6){
            status.addErro("Nome de usuário muito pequeno!");
        }
        if(rg.length() != 7){
            status.addErro("Numero de RG incorreto!");
        }
        if(cpf.length() != 11){
            status.addErro("Numero de CPF incorreto!");
        }
        if(telefone.length() < 10 || telefone.length() > 11){
            status.addErro("Numero de telefone incorreto!");
        }
        boolean emailArroba = false;
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                if(emailArroba){
                    status.addErro("Email incorreto!");
                    break;
                } else {
                    emailArroba = true;
                }
            }
        }
        if(!emailArroba){
            status.addErro("Email incorreto!");
        }
        return !status.fail();
    }
     
    @Override
    public boolean checaLogin(String login, String senha){
        if(login.length() == 0){
            status.addErro("Login não pode ter tamanho 0!");
        }
        if(senha.length() == 0){
            status.addErro("Senha não pode ter tamanho 0!");            
        }
        if(status.fail()){
            return false;
        }
        
        for(Usuario usr : usuarios){
            if(login.equals(usr.getLogin()) && senha.equals(usr.getSenha())){
                return true;
            }
        }
        
        status.addErro("Usuario ou senha incorreto!");
        return false;
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
}