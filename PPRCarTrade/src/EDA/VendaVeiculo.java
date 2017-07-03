package EDA;

import java.util.ArrayList;

/*
 * @author Arthur
 */

public class VendaVeiculo {
    private Veiculo veiculo;
    private UsuDados proprietario;
    private double preco;
    private ArrayList<Comentario> comentarios;
    
    /*-----------------------------------*/
    
    public VendaVeiculo(Veiculo veiculo, UsuDados proprietario, double preco, Comentario c){
        this.veiculo = veiculo;
        this.proprietario = proprietario;
        this.preco = preco;
        comentarios = new ArrayList<>();
        this.comentarios.add(c);
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
