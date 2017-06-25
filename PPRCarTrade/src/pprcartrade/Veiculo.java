package car.trade.system;

/*
 * @author Arthur
 */

public class Veiculo{
    private int ano;
    private String modelo;
    private String placa;
    private String marca;
    private String cor;
    private Comentario coment_veiculo;
    
    
    /*-----------------------------------*/
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public Comentario getComentVeiculo(){
        return coment_veiculo;
    }
    public void setComentVeiculo(Comentario coment_veiculo){
        this.coment_veiculo = coment_veiculo;
    }
    
}
