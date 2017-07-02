/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao.Comparadores;

import EDA.Usuario;
import java.util.Comparator;

/**
 *
 * @author weiss
 */
public class CPFComparator implements Comparator<Usuario> {
    @Override
    public int compare(Usuario a, Usuario b){
        return a.getCpf().compareTo(b.getCpf());
    }
            
}
