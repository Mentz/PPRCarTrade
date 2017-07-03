package EDA;
import java.util.*;

/*
 * @author Arthur
 */

public class Comentario {
    private String comment;
    
    /*-----------------------------------*/
    // Autor: Mentz e Felipe Weiss
    // Construtor sem argumentos
    public Comentario()
    {
        this.comment = "";
    }
    
    // Autor: Mentz e Felipe Weiss
    // Construtor com argumento Comentário
    public Comentario(String comentario)
    {
        if(comentario != ""){
            this.comment = comentario;
        } else {
            this.comment = "";
        }
    }    
    
    public String getComment(){
        return comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    /*-----------------------------------*/
    
    public void criar_comentario(){
        String aux;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Digite seu comentario:\n");
        aux = input.nextLine();
        setComment(aux);
    }
    
    public void editar_comentario(){
        String aux;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Seu comentario é:\n%s\n", getComment());
        System.out.printf("Digite o novo comentário:\n");
        
        aux = input.nextLine();
        setComment(aux);
    }
    
    public void excluir_comentario(){
        String aux = "";
        int confirmation = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Seu comentario é:\n%s\n", getComment());
        System.out.printf("Tem certeza que deseja excluir esse comentário? (Digite 1 para SIM e 0 para NÃO)\n");
        confirmation = input.nextInt();
        
        if(confirmation == 1){
            setComment(aux);
        }
    }
}
