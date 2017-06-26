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
 * @author Lucas
 */
public class NegocioFacade {
    // Autor: Mentz
    static final DAOFacade registro = DAOMemoria.getInstance();
    
    // Autor: Mentz
    public static boolean registrarUsuario(Usuario user)
    {
        return registro.registrarUsuario(user);
    }
    
    // Autor: Mentz
    public static void registrarVeiculo(Veiculo veiculo)
    {
        return registro.registrarVeiculo(veiculo);
    }
    
    // Autor: Mentz
    public static boolean registrarVendedor(Vendedor vendedor)
    {
        return registro.registrarVendedor(vendedor);
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
    
    // Autor: Mentz
    public static boolean checaLogin(String login, String senha)
    {
        return registro.checaLogin(login, senha);
    }
    
}
