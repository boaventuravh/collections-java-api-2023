package Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaEventosOrdenada = new TreeMap<>(agendaEventosMap);
        System.out.println(agendaEventosOrdenada);
    }

    public Map.Entry<LocalDate, Evento> obterProximoEvento(){
        LocalDate hoje = LocalDate.now();
        Map.Entry<LocalDate, Evento> proximoEvento = null;
        Map<LocalDate, Evento> agendaEventosOrdenada = new TreeMap<>(agendaEventosMap);
        for (Map.Entry<LocalDate, Evento> e : agendaEventosOrdenada.entrySet()){
            if (e.getKey().isEqual(hoje) || e.getKey().isAfter(hoje)){
                proximoEvento = e;
                break;
            }
        }
        return proximoEvento;
    }

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();
        LocalDate hoje = LocalDate.now();


        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY,20), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 17), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(hoje, "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 25), "Evento 4", "Atração 4");


        agendaEventos.exibirAgenda();

        System.out.println("Próximo evento: " + agendaEventos.obterProximoEvento());

    }

}
