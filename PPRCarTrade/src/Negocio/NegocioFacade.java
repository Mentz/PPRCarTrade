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
    public static Adm login(String login, String senha)
    {
        return registro.login(login, senha);
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
    
   
    
    // Autor: Mentz
    public static boolean checaCadastro(String nome, String rg, String cpf, String telefone, String email)
    {
        return registro.checaCadastro(nome, rg, cpf, telefone, email);
    }
    
    // Autor: Mentz
    public static Status getStatus()
    {
        return registro.getStatus();
    }
    
    public static boolean checaLoginUsuario(String login, String senha){
        return registro.checaLogin(login, senha);

    }
    
    // Autor: Mentz
    public static boolean checaLogin(String login, String senha)
    {
        Adm tmp = registro.login(login, senha);
        if (tmp == null)
            return false;
        else
            return true;
    }
    
    public static void adicionarVeiculoVendedor(Vendedor vendedor, Veiculo veiculo){
        if(registro.checaVendedor(vendedor)){
            registro.adicionarVeiculoVendedor(vendedor, veiculo);
        }
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
