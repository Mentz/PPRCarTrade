/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import EDA.Status;

/**
 *
 * @author weiss
 */
public class DAOFacade {
    
    private static DAOFacade instance;
    private Status status;
    
    private DAOFacade(){
        status = new Status();
    }
    
    public static synchronized DAOFacade getInstance(){
        if(instance == null){
            instance = new DAOFacade();
        }
        return instance;
    }
    
    public boolean checaLogin(String nome, String rg, String cpf, String telefone, String email){
        System.out.println("oi");
        if(nome.length() <=6){
            status.addErro("Nome de usuário muito pequeno!");
        }
        System.out.println("oi");
        if(rg.length() != 7){
            status.addErro("Numero de RG incorreto!");
        }
        System.out.println("oi");
        if(cpf.length() != 11){
            status.addErro("Numero de CPF incorreto!");
        }
        System.out.println("oi");
        if(telefone.length() < 10 || telefone.length() > 11){
            status.addErro("Numero de telefone incorreto!");
        }
        System.out.println("oi");
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
    
    public Status getStatus(){
        return status;
    }
    
}
