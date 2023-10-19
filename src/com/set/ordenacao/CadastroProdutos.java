package com.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtoSet;

    //contrutor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //Adiciona um produto ao cadastro.
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    //Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    //Exibe todos os produtos do cadastro em ordem crescente de preço.
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastrarProdutos =  new CadastroProdutos();

        cadastrarProdutos.adicionarProduto(1, "Produto 1", 30.00, 2);
        cadastrarProdutos.adicionarProduto(2, "Produto 2", 5.00, 4);
        cadastrarProdutos.adicionarProduto(3, "Produto 3", 3.00, 6);
        cadastrarProdutos.adicionarProduto(4, "Produto 4", 15.00, 8);

        // System.out.println(cadastrarProdutos.produtoSet);

        System.out.println(cadastrarProdutos.exibirProdutosPorPreco());
    }
}
