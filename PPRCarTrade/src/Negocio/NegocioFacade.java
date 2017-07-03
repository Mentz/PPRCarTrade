/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DAO.DAOFacade;
import DAO.DAOMemoria;
import EDA.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Mentz
 */
public class NegocioFacade {
    private static Adm admin = null;
    private static Usuario usuario = null;
    
    // Autor: Mentz
    static final DAOFacade registro = DAOMemoria.getInstance();
    
    // Autor: Mentz
    
    public static boolean registrarUsuario(Usuario user)
    {
        for (Usuario us : registro.listaUsuarios())
        {
            if (user.getCpf().compareTo(us.getCpf()) == 0)
                return false;
        }
        registro.registrarUsuario(user);
        return true;
    }
    
    // Autor: Mentz
   public static void registrarVeiculo(Veiculo veiculo)
    {
        registro.registrarVeiculo(veiculo);
    }
    
    // Autor: Mentz
   public static void registrarVendedor(Vendedor vendedor)
    {
        registro.registrarVendedor(vendedor);
    }
      
    
    // Autor: Mentz
    public static ArrayList<VendaVeiculo> listaVeiculos()
    {
        return registro.listaVeiculos();
    }
    // Autor: Felipe
    public static ArrayList<Usuario> listaUsuarios()
    {
        return registro.listaUsuarios();
    }
    
    public static boolean checaVendedor(Vendedor vendedor){
        for(Vendedor vnd : registro.listaVendedores()){
            if(vendedor.equals(vnd)){
                return true;
            }
        }
        
        registro.getStatus().addErro("Vendedor não encontrado");
        return false;
    }
    
    // Autor: Mentz
    public static boolean checaCadastro(String login, String senha, String nome, String rg, String cpf, String endereco, String cartMotorista, String telefone, String email)
    {   
        if(login.length() <= 6){
            registro.getStatus().addErro("Nome de usuário muito pequeno!");
        }        
        
        try {
            double aux = Double.parseDouble(rg);
        } catch(Exception e){
            registro.getStatus().addErro("Número de RG incorreto!");
        }
        
        try {
            double aux = Double.parseDouble(cpf);
        } catch(Exception e){
            registro.getStatus().addErro("Número de CPF incorreto!");
        }
        
        for(Usuario a : registro.listaUsuarios()){
            if(cpf.equals(a.getCpf())){
                registro.getStatus().addErro("Número de CPF já cadastrado!");
            }
            if(a.getLogin().equals(login)){
                registro.getStatus().addErro("Username já cadastrado!");
            }
        }
        
        if(telefone.length() < 10 || telefone.length() > 11){
            registro.getStatus().addErro("Numero de telefone incorreto!");
        }
        boolean emailArroba = false;
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                if(emailArroba){
                    registro.getStatus().addErro("Email incorreto!");
                    break;
                } else {
                    emailArroba = true;
                }
            }
        }
        if(!emailArroba){
            registro.getStatus().addErro("Email incorreto!");
        }
        
        if(!registro.getStatus().fail()){
            registro.cadastrarUsuario(login, senha, nome, rg, cpf, cartMotorista, endereco, telefone, email);
            return true;
        }
        return false;        
    }
    
    public static boolean checaLogin(String login, String senha){
        if(login.length() == 0){
            registro.getStatus().addErro("Login não pode ter tamanho 0!");
        }
        if(senha.length() == 0){
            registro.getStatus().addErro("Senha não pode ter tamanho 0!");            
        }
        if(registro.getStatus().fail()){
            return false;
        }
        
        for(Usuario usr : registro.listaUsuarios()){
            if(login.equals(usr.getLogin()) && senha.equals(usr.getSenha())){
                return true;
            }
        }
        
        registro.getStatus().addErro("Usuario ou senha incorreto!");
        return false;
    }
    
    // Autor: Mentz
    public static Status getStatus()
    {
        return registro.getStatus();
    }     
    
    // Autor: Mentz
    public static boolean checaLoginAdm(String login, String senha)
    {
        Adm tmp = registro.getAdm();
        if(login.equals(tmp.getLogin()) && senha.equals(tmp.getSenha())){
            return true;
        }
        return false;
    }
    
    public static boolean adicionarVeiculoVendedor(Vendedor vendedor, Veiculo veiculo){
        if(NegocioFacade.checaVendedor(vendedor)){
            registro.adicionarVeiculoVendedor(vendedor, veiculo);
            return true;
        }
        return false;
    }
    
    public static void setUsuarioLogado(String username, String password){
        registro.setUsuarioLogado(username, password);
    }
    
    public static Usuario getUsuarioLogado(){
        return registro.getUsuarioLogado();
    }
    
    //Autor: Arthur e Felipe Weiss
    public static boolean registrarVenda(VendaVeiculo venda){        
        if(venda.getVeiculo().getAno() < 1900){
            NegocioFacade.getStatus().addErro("Ano não pode ser tão baixo!");
        }
        if(venda.getPreco() < 0){
            NegocioFacade.getStatus().addErro("Valor de venda não pode ser negativo!");
        }
        if(!NegocioFacade.getStatus().fail()){
            registro.registrarVenda(venda);
            return true;
        }
        return false;
    }
    
    //Autor: Felipe Weiss
    public static boolean adicionarComentarioUsuario(UsuDados proprietario, String comentario){
        if(comentario.length() > 0){
            registro.adicionarComentarioUsuario(proprietario, comentario);
        } else {
            NegocioFacade.getStatus().addErro("Comentario não pode ser vazio!");
        }
        return !NegocioFacade.getStatus().fail();
    }
    
    public static boolean adicionarComentarioVeiculo(VendaVeiculo veiculo, String comentario){
        if(comentario.length() > 0){
            registro.adicionarComentarioVeiculo(veiculo, comentario);
        } else {
            getStatus().addErro("Comentário não pode ser vazio!");
        }
        return !getStatus().fail();
    }
    
    public static String getComentariosUsuario(UsuDados usuario){
        ArrayList<Usuario> aux = registro.listaUsuarios();
        int idx = 0;
        for(Usuario a : aux){
            if(a.getCpf().equals(usuario.getCpf())){
                return aux.get(idx).getComentUsu().getComment();
            }
            idx++;
        }
        return "";
    }
    
}
