package EDA;

/*
 * @author Arthur
 */
public class Adm extends UsuDados{
    private String login;
    private String senha;
    
    public Adm(String login, String senha, String nome, String cpf, int carteira_motorista, String e_mail, String endereco, Comentario coment_usu, String fone) {
        super(nome, cpf, carteira_motorista, e_mail, endereco, coment_usu, fone);
        this.login = login;
        this.senha = senha;
    }
    
    /*-------------------------------------*/
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){ 
        this.login = login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    /*-------------------------------------*/
}
