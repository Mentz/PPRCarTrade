/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Felipe
 */
public class Controlador {
    
    public static float calculaMulta(int denuncia){
        switch(denuncia){
            case 0 : return 0F;
            case 1 : return 25.00F;
            case 2 : return 50.00F;
            default: return 100.00F;
            
        }
    }
    
    public static float calculaPremium(int premium){
       
        
        if (premium >=6 && premium <=10 ){
            return 9.90F;
        }
        if(premium >=11 && premium <=30){
            return 19.90F;
        }
        if(premium >=31 && premium <=50){
            return 29.90F;
        }
        if(premium >50){
           return 49.90F;
        }
       return 9.90F; 
    }
}
