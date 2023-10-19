package com.set.operacoesbasicas.conjunto;

import java.util.HashSet;
import java.util.Set;

import javax.print.DocFlavor.READER;

public class ConjuntoConvidado {
    //atributo
    private Set<Convidado> convidadoSet;

    //Construtor
    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }
    
    //Adiciona um convidado ao conjunto.
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //Remove um convidado do conjunto com base no código do convite.
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    //Conta o número total de convidados no Set.
    public int contarConvidados() {
        return convidadoSet.size();
    }

    //Exibe todos os convidados do conjunto.
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidados = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1001);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1002);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1003);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1004);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1001);
        System.out.println("Removendo convite...");
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

    }

}
