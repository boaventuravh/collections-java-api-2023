package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!contatosMap.isEmpty()){
            contatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(contatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer contatoPorNome = null;
        if (contatosMap.containsKey(nome)){
            contatoPorNome = contatosMap.get(nome);
        }
        return contatoPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Jorge", 123);
        agendaContatos.adicionarContato("Antônio", 321);
        agendaContatos.adicionarContato("Xamã", 456);
        agendaContatos.adicionarContato("Charles Xavier", 654);
        agendaContatos.adicionarContato("Brit", 789);
        agendaContatos.adicionarContato("Ney", 987);

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Jorge", 12356);
        agendaContatos.removerContato("Ney");

        agendaContatos.exibirContatos();

        System.out.println("Pesquisa: ");
        var contatoPesquisado = agendaContatos.pesquisarPorNome("Brit");
        System.out.println(contatoPesquisado);

    }

}
