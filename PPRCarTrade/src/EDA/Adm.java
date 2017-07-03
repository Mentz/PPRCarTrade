package EDA;

/*
 * @author Arthur
 */
public class Adm extends UsuDados{
    private String login;
    private String senha;
    
    // Construtor por parâmetros
    public Adm(String login, String senha, String nome, String cpf, String rg, String endereco, String carteira_motorista, String fone, String e_mail) {
        super(nome, cpf, rg, endereco, carteira_motorista, fone, e_mail);
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
