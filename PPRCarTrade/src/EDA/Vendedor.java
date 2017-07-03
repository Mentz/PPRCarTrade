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
    public Vendedor(String nome, String cpf, String carteira_motorista, String e_mail, String endereco, Comentario coment_usu, String fone) {
        super(nome, cpf, "654987321", endereco, carteira_motorista, fone, e_mail);
    }
    
    public void cadastrarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }
}
