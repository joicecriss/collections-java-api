package com.map.operacoesbasicas.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    //construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //diciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    //Remove um contato da agenda, dado o nome do contato.
    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    //Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    //Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joice", 96612810);
        agendaContatos.adicionarContato("Joice Cristina", 92612810);
        agendaContatos.adicionarContato("Joice Alves", 93612810);
        agendaContatos.adicionarContato("João", 88759632);
        agendaContatos.adicionarContato("Eliana", 77456321);
        agendaContatos.adicionarContato("Carlos", 66852341);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Carlos");
        System.out.println("Removendo contato...");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Joice"));
    }
    
}
