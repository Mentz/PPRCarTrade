/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao.Comparadores;

import EDA.UsuDados;
import java.util.Comparator;

/**
 *
 * @author Felipe
 */
public class ProprietarioComparador implements Comparator<UsuDados>{
    public int compare(UsuDados a, UsuDados b){
        if (a.getCpf().equals(b.getCpf())) {
            return -1 * a.getCpf().compareTo(b.getCpf());
        } else {
            return a.getCpf().compareTo(b.getCpf());
        }
    }
}
