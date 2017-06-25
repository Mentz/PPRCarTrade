package car.trade.system;

/*
 * @author Arthur
 */

public class UsuDados {
    private String nome;
    private int cpf;
    private int carteira_motorista;
    private String e_mail;
    private String endereco;
    private Comentario coment_usu;
    private int fone;
    
    
    /*-----------------------------------*/
    public UsuDados(String nome, int cpf, int carteira_motorista, String e_mail, String endereco, Comentario coment_usu, int fone){
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
    
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    public int getCarteiraMotorista(){
        return carteira_motorista;
    }
    public void setCarteiraMotorista(int carteira_motorista){
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
    
    public int getFone(){        
        return fone;
    }
    public void setFone(int fone){
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
