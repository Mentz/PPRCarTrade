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
public class NomeComparator implements Comparator<VendaVeiculo>{
    public int compare(VendaVeiculo a, VendaVeiculo b){
        if (a.getVeiculo().getModelo().equals(b.getVeiculo().getModelo())) {
            return -1 * a.getVeiculo().getModelo().compareTo(b.getVeiculo().getModelo());
        } else {
            return a.getVeiculo().getModelo().compareTo(b.getVeiculo().getModelo());
        }
    }
}
