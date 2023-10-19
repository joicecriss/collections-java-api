package com.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    //Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    //Exibe todos os produtos, suas quantidades em estoque e preços.
    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    //Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if(!estoqueProdutoMap.isEmpty()) {
            for(Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    //Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutoMap.isEmpty()) {
            for(Produto p : estoqueProdutoMap.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Produto 1", 2, 5.00);
        estoqueProdutos.adicionarProduto(2, "Produto 2", 4, 10.00);
        estoqueProdutos.adicionarProduto(3, "Produto 3", 6, 15.00);
        estoqueProdutos.adicionarProduto(4, "Produto 4", 8, 20.00);
        estoqueProdutos.adicionarProduto(5, "Produto 5", 10, 25.00);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        
    }
}
