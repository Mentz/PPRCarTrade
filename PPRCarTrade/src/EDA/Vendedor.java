/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDA;

import java.util.ArrayList;

/**
 *
 * @author weiss
 */
public class Vendedor extends UsuDados{
    private ArrayList<Veiculo> veiculos;
    public Vendedor(String nome, String cpf, int carteira_motorista, String e_mail, String endereco, Comentario coment_usu, String fone) {
        super(nome, cpf, carteira_motorista, e_mail, endereco, coment_usu, fone);
    }
    
    public void cadastrarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }
}
