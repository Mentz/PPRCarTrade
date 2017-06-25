package car.trade.system;

/*
 * @author Arthur
 */

public class VendaVeiculo {
    private Veiculo veiculo;
    private UsuDados proprietario;
    private double preco;
    private Comentario adicionais;
    
    /*-----------------------------------*/
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
    
    public Comentario getAdicionais(){
        return adicionais;
    }
    public void setAdicionais(Comentario adicionais){
        this.adicionais = adicionais;
    }
    
    /*-----------------------------------*/
    
}
