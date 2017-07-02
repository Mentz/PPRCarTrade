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
    public ArrayList<Vendedor> listaVendedores();
    public void adicionarVeiculoVendedor(Vendedor vendedor, Veiculo veiculo);
    public boolean alterarRegistro(Veiculo veiculo, Veiculo newVeiculo);
    public boolean excluirRegistro(Veiculo veiculo);
    public boolean checaCadastro(String nome, String rg, String cpf, String telefone, String email);
    public boolean checaLogin(String login, String senha);
    public Status getStatus();
    public void registrarVenda(VendaVeiculo venda);
    public boolean checaVendedor(Vendedor vendedor);
    public void adicionarComentarioUsuario(UsuDados proprietario, String comentario);
    public void adicionarComentarioVeiculo(VendaVeiculo veiculo, String comentario);
    public void setUsuarioLogado(String username, String password);
    public Usuario getUsuarioLogado();
}