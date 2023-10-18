package com.list.operacoesbasicas.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //Adiciona uma nova tarefa à lista com a descrição fornecida.
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    //Remove uma tarefa da lista com base em sua descrição.
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    //Retorna o número totaç de tarefas na lista.
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    //Retorna uma lista contendo a descrição de todas as tarefas na lista.
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        
        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
