package soma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros(){
        listaNumeros = new ArrayList<>();

    }

    private List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        for (int i : listaNumeros)
            soma += i;

        return soma;
    }

    public int encontrarMaiorNumero(){
        List<Integer> listaOrdenada = listaNumeros;
        Collections.sort(listaOrdenada);
        Collections.reverse(listaOrdenada);
        return listaOrdenada.get(0);
    }

    public  int encontrarMenorNumero(){
        List<Integer> listaOrdenada = listaNumeros;
        Collections.sort(listaOrdenada);
        return listaOrdenada.get(0);
    }

    public List<Integer> exibirNumeros(){
        return this.getListaNumeros();
    }

}
