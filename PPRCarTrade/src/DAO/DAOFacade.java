/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import EDA.Status;
import EDA.VendaVeiculo;
import java.util.ArrayList;

/**
 *
 * @author weiss
 */
public class DAOFacade {
    
    private static DAOFacade instance;
    private Status status;
    private DAOMemoria registros;
    
    private DAOFacade(){
        status = new Status();
        registros = DAOMemoria.getInstance();
    }
    
    public static synchronized DAOFacade getInstance(){
        if(instance == null){
            instance = new DAOFacade();
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
    
    public ArrayList<VendaVeiculo> getVeiculos(){
        return registros.getVeiculos();
    }
    
}
