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
 * @author weiss
 * @redator Lucas
 */
public interface DAOFacade {
    public ArrayList<VendaVeiculo> getVeiculos();
    public boolean checaCadastro(String nome, String rg, String cpf, String telefone, String email);
    public boolean checaLogin(String login, String senha);
    public Status getStatus();
}