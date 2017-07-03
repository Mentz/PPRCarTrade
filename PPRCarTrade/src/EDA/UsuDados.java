package EDA;

import java.util.ArrayList;

/*
 * @author Arthur
 */

public class UsuDados {
    private String nome;
    private String cpf;
    private String rg;
    private String carteira_motorista;
    private String e_mail;
    private String endereco;
    private ArrayList<Comentario> coment_usu;
    private String fone;
    
    
    /*-----------------------------------*/
    public UsuDados(String nome, String cpf, String rg, String endereco, String carteira_motorista, String fone, String e_mail){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.carteira_motorista = carteira_motorista;
        this.e_mail = e_mail;
        this.endereco = endereco;
        this.coment_usu = new ArrayList<>();
        this.fone = fone;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCarteiraMotorista(){
        return carteira_motorista;
    }
    public void setCarteiraMotorista(String carteira_motorista){
        this.carteira_motorista = carteira_motorista;
    }
    
    public String getEmail(){
        return e_mail;
    }
    public void setEmail(String e_mail){
        this.e_mail = e_mail;
    }
    
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getFone(){        
        return fone;
    }
    public void setFone(String fone){
        this.fone = fone;
    }
    
    public ArrayList<Comentario> getComentUsu(){        
        return coment_usu;
    }
    public void setComentUsu(Comentario coment_usu){
        this.coment_usu.add(coment_usu);
    }
    /*-----------------------------------*/
}
