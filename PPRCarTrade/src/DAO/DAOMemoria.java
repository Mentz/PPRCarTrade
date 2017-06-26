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
    
    private DAOMemoria(){
        this.status = new Status();
        veiculos = new ArrayList<>();
        Comentario c = new Comentario();
        c.setComment("oi");
        Veiculo b1 = new Veiculo(2010, "Exemplo1", "FWW1013", "Exemplao1", "Verde", c);    
        Veiculo b2 = new Veiculo(2010, "Exemplo2", "FWY1013", "Exemplao2", "Azul", c);
        Veiculo b3 = new Veiculo(2010, "Exemplo3", "FWZ1013", "Exemplao3", "Vermelho", c);
        Veiculo b4 = new Veiculo(2010, "Exemplo4", "FWA1013", "Exemplao4", "Roxo", c);
        Veiculo b5 = new Veiculo(2010, "Exemplo5", "FWB1013", "Exemplao5", "Dourado", c);
        UsuDados p1 = new UsuDados("FF", "120", 5, "as", "as", c, "asas");
        vendaVeiculos.add(new VendaVeiculo(b1, p1, 25555.33, c));
        vendaVeiculos.add(new VendaVeiculo(b2, p1, 10000.33, c));
        vendaVeiculos.add(new VendaVeiculo(b3, p1, 5626.33, c));
        vendaVeiculos.add(new VendaVeiculo(b4, p1, 300000.33, c));
        vendaVeiculos.add(new VendaVeiculo(b5, p1, 132000.33, c));
    }
    
    // Autor: Mentz
    public void registrarUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }
    
    // Autor: Mentz
    public void registrarVeiculo(Usuario usuario, Veiculo veiculo)
    {
        veiculos.add(veiculo);
    }
    
    // Autor: Mentz
    public Adm login(String login, String senha)
    {
        
    }
    
    // Autor: Mentz
    public boolean alterarRegistro(Veiculo veiculo)
    {
        
    }
    
    // Autor: Mentz
    public boolean excluirRegistro(Veiculo veiculo)
    {
        
    }
    
    // Autor: Mentz
    public ArrayList<VendaVeiculo> listaVeiculos(){
        return vendaVeiculos;
    }
    
    // Autor: Mentz
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
        if(!status.fail()){
            return true;
        }
        return false;
    }
     
    public boolean checaLogin(String login, String senha){
        if(login.length() == 0){
            status.addErro("Login incorreto!");
        }
        if(senha.length() == 0){
            status.addErro("Senha incorreta!");
        }
        if(status.fail()){
            return false;
        }
        return true;
    }
    
    public Status getStatus(){
        return status;
    }
}
