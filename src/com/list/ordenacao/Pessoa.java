package com.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    //atributos
    private String nome;
    private int idade;
    private double alura;

    //construtor
    public Pessoa(String nome, int idade, double alura) {
        this.nome = nome;
        this.idade = idade;
        this.alura = alura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAlura() {
        return alura;
    }
    
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", alura=" + alura + "]";
    }

}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAlura(), p2.getAlura());
    }
    
}
