package numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaInteiros;

    public OrdenacaoNumeros(){
        listaInteiros = new ArrayList<>();
    }

    public List<Integer> getListaInteiros() {
        return listaInteiros;
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordemAscendente = new ArrayList<>(listaInteiros);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordemDescendente = new ArrayList<>(listaInteiros);
        Collections.sort(ordemDescendente);
        Collections.reverse(ordemDescendente);
        return ordemDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(13);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(75);
        ordenacaoNumeros.adicionarNumero(43);

        System.out.println("Ordem original: " + ordenacaoNumeros.listaInteiros);
        System.out.println("Ordem crescente: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Decrescente: " + ordenacaoNumeros.ordenarDescendente());
    }

}
