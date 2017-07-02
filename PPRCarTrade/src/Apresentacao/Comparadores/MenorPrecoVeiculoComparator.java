/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao.Comparadores;

import EDA.VendaVeiculo;
import java.util.Comparator;

/**
 *
 * @author weiss
 */
public class MenorPrecoVeiculoComparator implements Comparator<VendaVeiculo>{
    @Override
    public int compare(VendaVeiculo a, VendaVeiculo b){
        if (a.getPreco() == b.getPreco()) {
            if(a.getVeiculo().getMarca().equals(b.getVeiculo().getMarca())){
                if(a.getVeiculo().getModelo().equals(b.getVeiculo().getModelo())){
                    return (a.getVeiculo().getAno() <= b.getVeiculo().getAno() ? -1 : 1);
                } else {
                    return a.getVeiculo().getModelo().compareTo(b.getVeiculo().getModelo());
                }
            } else {
                return a.getVeiculo().getMarca().compareTo(b.getVeiculo().getMarca());
            }
        } else {
            return (a.getPreco() < b.getPreco() ? -1 : 1);
        }
    }
}
