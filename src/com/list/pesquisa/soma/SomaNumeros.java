package com.list.pesquisa.soma;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomaNumeros {
    //atributo
    private List<Integer> numeroList = new ArrayList<>();

    //construtor
    public SomaNumeros() {
    }

    //Adiciona um número à lista de números.
    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    //Calcula a soma de todos os números da lista e retorna o resultado.
    public int calcularSoma() {
        int soma = 0;
  
        Integer numero;
        for(Iterator var2 = this.numeroList.iterator(); var2.hasNext(); soma += numero) {
           numero = (Integer)var2.next();
        }
  
        return soma;
     }

    //Encontra o maior número na lista e retorna o valor.
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!this.numeroList.isEmpty()) {
           Iterator var2 = this.numeroList.iterator();
  
           while(var2.hasNext()) {
              Integer numero = (Integer)var2.next();
              if (numero >= maiorNumero) {
                 maiorNumero = numero;
              }
           }
  
           return maiorNumero;
        } else {
           throw new RuntimeException("A lista est\u00e1 vazia!");
        }
     }

    //Encontra o menor número na lista e retorna o valor.
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!this.numeroList.isEmpty()) {
           Iterator var2 = this.numeroList.iterator();
  
           while(var2.hasNext()) {
              Integer numero = (Integer)var2.next();
              if (numero <= menorNumero) {
                 menorNumero = numero;
              }
           }
  
           return menorNumero;
        } else {
           throw new RuntimeException("A lista est\u00e1 vazia!");
        }
     }

    //Retorna uma lista contendo todos os números presentes na lista.
    public void exibirNumeros() {
        if (!this.numeroList.isEmpty()) {
           System.out.println(this.numeroList);
        } else {
           System.out.println("A lista est\u00e1 vazia!");
        }
  
     }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("N\u00fameros adicionados:");
        somaNumeros.exibirNumeros();
        
        System.out.println("Soma dos n\u00fameros = " + somaNumeros.calcularSoma());
        System.out.println("Maior n\u00famero = " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor n\u00famero = " + somaNumeros.encontrarMenorNumero());
    }
    
}
