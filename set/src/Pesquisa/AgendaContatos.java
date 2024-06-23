package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosEncontrados.add(c);
            }
        }
        return contatosEncontrados;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João Felipe", 1111);
        agendaContatos.adicionarContato("João Felipe", 2222);
        agendaContatos.adicionarContato("João Pedro", 2222);
        agendaContatos.adicionarContato("João Gabriel", 3333);
        agendaContatos.adicionarContato("Carlos Lacerda", 4444);

        agendaContatos.exibirContatos();

        Set<Contato> pesquisa = new HashSet<>();
        pesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println(pesquisa);

        agendaContatos.atualizarNumeroContato("João Pedro", 5555);
        agendaContatos.exibirContatos();
    }

}
