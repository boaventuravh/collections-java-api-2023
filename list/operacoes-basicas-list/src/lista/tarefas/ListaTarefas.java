package lista.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    public ListaTarefas(){
        TaskList = new ArrayList<>();
    }
    private List<Tarefa> TaskList;

    public List<Tarefa> getTaskList() {
        return TaskList;
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        TaskList.add(tarefa);
    }

    public void removerTarefa(String descricao){
        List<Tarefa> listaRemove = new ArrayList<>();

        for (Tarefa t: TaskList) {
            if (t.getDescricao().equalsIgnoreCase(descricao))
                listaRemove.add(t);
        }

        TaskList.removeAll(listaRemove);
    }

    public int obterNumeroTotalTarefas(){
        return TaskList.size();
    }

    public List<String> obterDescricoesTarefas(){
        List<String> descricoes = new ArrayList<>();

        for (Tarefa t : TaskList)
            descricoes.add(t.getDescricao());

        return descricoes;
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Task 1");
        listaTarefas.adicionarTarefa("Task 2");

        System.out.println("Descrição tarefas: " + listaTarefas.obterDescricoesTarefas());

    }


}
