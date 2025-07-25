package Eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(date, evento);
    }

    //ordenar
    public void exibirEvento(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public static void main(String[] args) {
        AgendaEventos eventoMap = new AgendaEventos();


    }


}
