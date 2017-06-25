package EDA;
import java.util.*;

/*
 * @author Arthur
 */
public class Usuario {
    private String login;
    private String senha;
    private UsuDados dados;
    
    /*-------------------------------------*/    
    public Usuario(String login, String senha, UsuDados dados){
        this.login = login;
        this.senha = senha;
        this.dados = dados;
    }
    
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
    
    public void cadastra_usuario(){
        int carteira_motorista, fone;
        String nome, e_mail, endereco, cpf;
        Comentario coment_usu = new Comentario();
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Digite seu nome: ");
        nome = input.nextLine();
        
        System.out.printf("Digite seu cpf: ");
        cpf = input.nextLine();
        
        System.out.printf("Digite o numero da sua carteira de motorista: ");
        carteira_motorista = input.nextInt();
        
        System.out.printf("Digite seu email: ");
        e_mail = input.nextLine();
        
        System.out.printf("Digite seu endereco: ");
        endereco = input.nextLine();  
        
        coment_usu.criar_comentario();
        
        System.out.printf("Digite seu telefone: ");
        fone = input.nextInt();
        
        UsuDados data = new UsuDados(nome, cpf, carteira_motorista, e_mail, endereco, coment_usu, fone);
        
        dados = data;
    }
    
}
