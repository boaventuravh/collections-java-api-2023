package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        for (Tarefa t : tarefasSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasSet.remove(t);
                break;
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public void contarTarefas(){
        System.out.println(tarefasSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet){
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasSet){
            if (!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefasSet){
            if (t.getDescricao().equalsIgnoreCase(descricao) && !t.isConcluida()){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : tarefasSet){
            if (t.getDescricao().equalsIgnoreCase(descricao) && t.isConcluida()){
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas(){
        Set<Tarefa> tarefasParaRemover = tarefasSet;
        tarefasSet.removeAll(tarefasParaRemover);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Fazer exercício");
        listaTarefas.adicionarTarefa("Cozinhar o almoço");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Limpar a casa");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Estudar");
        listaTarefas.marcarTarefaConcluida("Limpar a casa");

        var concluidas = listaTarefas.obterTarefasConcluidas();
        System.out.println("CONCLUÍDAS: " + concluidas);

        var pendentes = listaTarefas.obterTarefasPendentes();
        System.out.println("PENDENTES: " + pendentes);

        System.out.println("Total de tarefas: ");
        listaTarefas.contarTarefas();

        listaTarefas.removerTarefa("Limpar a casa");

        System.out.println("Total de tarefas: ");
        listaTarefas.contarTarefas();

        listaTarefas.limparListaTarefas();

        System.out.println("Total de tarefas: ");
        listaTarefas.contarTarefas();

        listaTarefas.exibirTarefas();


    }

}
