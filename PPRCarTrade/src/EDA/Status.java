/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDA;

/**
 *
 * @author weiss
 */
public class Status {
    
    private String mensagem;
    private boolean erro;

    public Status(){
        this.mensagem = "";
        this.erro = false;
    }
    
    public void addErro(String mensagem){
        this.erro = true;
        this.mensagem += mensagem + "\n";
    }
    
    public String getErro(){
        String aux = this.mensagem;
        this.mensagem = "";
        this.erro = false;
        return aux;
    }
    
    public boolean fail(){
        return erro;
    }
    
}
