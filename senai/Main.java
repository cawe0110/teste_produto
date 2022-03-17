package br.com.senai;

import br.com.senai.model.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Café");
        produto.setPreco(24.50);

        Produto produto2 = new Produto();
        produto2.setNome("Leite");
        produto2.setPreco(20.0);

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(produto);
        produtos.add(produto2);

        for (int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i).getPreco());
        }





    }
}
