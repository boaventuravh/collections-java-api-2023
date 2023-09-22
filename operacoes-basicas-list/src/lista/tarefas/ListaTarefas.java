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
        TaskList.removeIf(t -> t.getDescricao().equals(descricao));
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


}
