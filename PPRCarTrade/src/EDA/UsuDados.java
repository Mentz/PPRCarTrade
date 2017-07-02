package EDA;

/*
 * @author Arthur
 */

public class UsuDados {
    private String nome;
    private String cpf;
    private String carteira_motorista;
    private String e_mail;
    private String endereco;
    private Comentario coment_usu;
    private String fone;
    
    
    /*-----------------------------------*/
    public UsuDados(String nome, String cpf, String carteira_motorista, String e_mail, String endereco, Comentario coment_usu, String fone){
        this.nome = nome;
        this.cpf = cpf;
        this.carteira_motorista = carteira_motorista;
        this.e_mail = e_mail;
        this.endereco = endereco;
        this.coment_usu = coment_usu;
        this.fone = fone;
    }
    
    public String getNome(){
        return nome;
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
    
    public Comentario getComentUsu(){        
        return coment_usu;
    }
    public void setComentUsu(Comentario coment_usu){
        this.coment_usu = coment_usu;
    }
    /*-----------------------------------*/
}
