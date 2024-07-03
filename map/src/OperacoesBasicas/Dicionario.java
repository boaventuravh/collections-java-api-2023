package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoEncontrada = null;
        if (dicionarioMap.containsKey(palavra)){
            definicaoEncontrada = dicionarioMap.get(palavra);
        }
        return definicaoEncontrada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra 1", "Definição 1");
        dicionario.adicionarPalavra("Palavra 2", "Definição 2");
        dicionario.adicionarPalavra("Palavra 3", "Definição 3");

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("Palavra 1", "Definição um");

        dicionario.exibirPalavras();

        var definicaoPesquisada = dicionario.pesquisarPorPalavra("Palavra 2");

        System.out.println("Definição da palavra pesquisada: " + definicaoPesquisada);

        dicionario.removerPalavra("Palavra 1");

        dicionario.exibirPalavras();

    }

}
