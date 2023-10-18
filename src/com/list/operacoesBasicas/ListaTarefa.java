package com.list.operacoesBasicas;

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

}
