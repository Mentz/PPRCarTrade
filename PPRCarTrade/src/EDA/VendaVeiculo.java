package EDA;

/*
 * @author Arthur
 */

public class VendaVeiculo {
    private Veiculo veiculo;
    private UsuDados proprietario;
    private double preco;
    private Comentario comentario;
    
    /*-----------------------------------*/
    
    public VendaVeiculo(Veiculo veiculo, UsuDados proprietario, double preco, Comentario c){
        this.veiculo = veiculo;
        this.proprietario = proprietario;
        this.preco = preco;
        this.comentario = c;
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
    
    public Comentario getComentarios(){
        return comentario;
    }
    public void setComentarios(Comentario comentario){        
        this.comentario.setComment(comentario.getComment());
    }
    
    /*-----------------------------------*/
    
}
