package EDA;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * @author Arthur
 */

public class VendaVeiculo {
    private Veiculo veiculo;
    private UsuDados proprietario;
    private ArrayList<ImageIcon> imagensDoCarro;
    private double preco;
    private ArrayList<Comentario> comentarios;
    
    /*-----------------------------------*/
    
    public VendaVeiculo(Veiculo veiculo, UsuDados proprietario, double preco, Comentario c){
        this.veiculo = veiculo;
        this.proprietario = proprietario;
        this.preco = preco;
        this.imagensDoCarro = new ArrayList<>();
        comentarios = new ArrayList<>();
        this.comentarios.add(c);
    }
    
    public ArrayList<ImageIcon> getImagens(){
        return imagensDoCarro;               
    }
    
    public void addImagens(ImageIcon imagem){
        this.imagensDoCarro.add(imagem);
    }
    
    public void setImagens(ArrayList<ImageIcon> imagens){
        this.imagensDoCarro = imagens;
    }
    
    public Veiculo getVeiculo(){
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public UsuDados getProprietario(){
        return proprietario;
    }
    public void setProprietario(UsuDados proprietario){
        this.proprietario = proprietario;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public ArrayList<Comentario> getComentarios(){
        return comentarios;
    }
    public void setComentarios(Comentario comentario){        
        this.comentarios.add(comentario);
    }
    
    /*-----------------------------------*/
    
}
