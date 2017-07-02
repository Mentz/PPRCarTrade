/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import EDA.*;
import java.util.ArrayList;
/**
 *
 * @author Lucas Mentz
 */
public interface DAOFacade {
    public void registrarUsuario(Usuario usuario);
    public void registrarVendedor(Vendedor vendedor);
    public void registrarVeiculo(Veiculo veiculo);
    public Adm login(String login, String senha);
    public ArrayList<VendaVeiculo> listaVeiculos();
    public ArrayList<Usuario> listaUsuarios();
    public boolean alterarRegistro(Adm adm, Veiculo veiculo1, Veiculo veiculo2);
    public boolean excluirRegistro(Adm adm, Veiculo veiculo);
    public boolean checaCadastro(String nome, String rg, String cpf, String telefone, String email);
    public boolean checaLogin(String login, String senha);
    public Status getStatus();
}