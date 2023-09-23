import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        listaPessoas = new ArrayList<>();
    }

    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenada = new ArrayList<>(listaPessoas);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaOrdenada = new ArrayList<>(listaPessoas);
        Collections.sort(listaOrdenada, new OrdenaPorAultura());
        return listaOrdenada;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Pessoa 1", 12, 1.5);
        ordenacaoPessoas.adicionarPessoa("Pessoa 2", 15, 1.7);
        ordenacaoPessoas.adicionarPessoa("Pessoa 3", 7, 1.5);
        ordenacaoPessoas.adicionarPessoa("Pessoa 4", 25, 1.85);
        ordenacaoPessoas.adicionarPessoa("Pessoa 5", 10, 1.5);

        System.out.println("Lista ordenada por idade: " + ordenacaoPessoas.ordenarPorIdade().toString());
        System.out.println("Lista ordenada por altura: " + ordenacaoPessoas.ordenarPorAltura().toString());

    }

}
