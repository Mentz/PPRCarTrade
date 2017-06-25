package pprcartrade;

/*
 * @author Arthur
 */
public class Adm {
    private String login;
    private String senha;
    private UsuDados dados;
    
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
    
    public UsuDados getDados(){
        return dados;
    }
    public void setDados(UsuDados dados){
        this.dados = dados;
    }
    /*-------------------------------------*/
}
