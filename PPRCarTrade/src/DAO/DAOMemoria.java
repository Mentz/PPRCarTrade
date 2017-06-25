/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import EDA.Comentario;
import EDA.UsuDados;
import EDA.Veiculo;
import EDA.VendaVeiculo;
import java.util.ArrayList;

/**
 *
 * @author weiss
 */
public class DAOMemoria {
    
    private static DAOMemoria instance;
    private ArrayList<VendaVeiculo> veiculos;    
    
    private DAOMemoria(){
        veiculos = new ArrayList<>();
        Comentario c = new Comentario();
        c.setComment("oi");
        Veiculo b1 = new Veiculo(2010, "Exemplo1", "FWW1013", "Exemplao1", "Verde", c);    
        Veiculo b2 = new Veiculo(2010, "Exemplo2", "FWY1013", "Exemplao2", "Azul", c);
        Veiculo b3 = new Veiculo(2010, "Exemplo3", "FWZ1013", "Exemplao3", "Vermelho", c);
        Veiculo b4 = new Veiculo(2010, "Exemplo4", "FWA1013", "Exemplao4", "Roxo", c);
        Veiculo b5 = new Veiculo(2010, "Exemplo5", "FWB1013", "Exemplao5", "Dourado", c);
        UsuDados p1 = new UsuDados("FF", "120", 5, "as", "as", c, "asas");
        veiculos.add(new VendaVeiculo(b1, p1, 25555.33, c));
        veiculos.add(new VendaVeiculo(b2, p1, 10000.33, c));
        veiculos.add(new VendaVeiculo(b3, p1, 5626.33, c));
        veiculos.add(new VendaVeiculo(b4, p1, 300000.33, c));
        veiculos.add(new VendaVeiculo(b5, p1, 132000.33, c));
    }
    
    public static synchronized DAOMemoria getInstance(){
        if(instance == null){
            instance = new DAOMemoria();
        }
        return instance;
    }
    
    public ArrayList<VendaVeiculo> getVeiculos() {
        return veiculos;
    }

    private Object Comentario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
