package com.map.ordenacao;

public class Evento {
    private String nome;
    private String atracao;
    public Evento(String nomeEvento, String nomeAtracao) {
        this.nome = nomeEvento;
        this.atracao = nomeAtracao;
    }
    public String getNomeEvento() {
        return nome;
    }
    public String getNomeAtracao() {
        return atracao;
    }
    @Override
    public String toString() {
        return "{ Evento: " + nome + ", Atração: " + atracao + " }";
    }    
}
