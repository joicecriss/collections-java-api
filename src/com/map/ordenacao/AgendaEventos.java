package com.map.ordenacao;

import java.security.PublicKey;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    // Adiciona um evento à agenda.
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    // Exibe a agenda de eventos em ordem crescente de data.
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    //Retorna o próximo evento que ocorrerá.
    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.APRIL, 15), "Encontro das Tribos", "KayBlack");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 9), "WildTrapFestival", "Veigh");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 18), "CIA", "Mc Cabelinho");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 20), "IntegraBixos", "LIU");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 5), "Intercursos", "Mu540");


        agendaEventos.obterProximoEvento();
    }
}
