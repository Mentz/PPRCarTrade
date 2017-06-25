
package EDA;

/*
 * @author Arthur
 */
public class Negocios {
    private Compra compra;
    private VendaVeiculo veiculo;
    private Venda venda;
    
    /*-----------------------------------*/
    public Compra getCompra(){
        return compra;
    }
    public void setCompra(Compra compra){
        this.compra = compra;
    }
    
    public VendaVeiculo getGaragem(){
        return veiculo;
    }
    public void setGaragem(VendaVeiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public Venda getVenda(){
        return venda;
    }
    public void setVenda(Venda venda){
        this.venda = venda;
    }    
    /*-----------------------------------*/
    
}
