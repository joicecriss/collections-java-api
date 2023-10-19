package com.set.pesquisa.agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    //construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //Adiciona um contato à agenda.
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    //Exibe todos os contatos da agenda.
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    //Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c :contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    //Atualiza o número de telefone de um contato específico.
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 123456);
        agendaContatos.adicionarContato("Contato 2", 789456);
        agendaContatos.adicionarContato("Contato 3", 897562);
        agendaContatos.adicionarContato("Contato 4", 698574);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Contato 1"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Contato 1", 349966128));
        
    }
}
