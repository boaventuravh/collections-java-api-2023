package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras(){
        contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemPalavrasMap);
    }

    public HashMap<String, Integer> encontrarPalavraMaisFrequente(){
        HashMap<String, Integer> palavraMaisFrequenteContagem = new HashMap<>();
        String palavraMaisFrequente = "";
        Integer maiorContagem = Integer.MIN_VALUE;
        palavraMaisFrequenteContagem.put(palavraMaisFrequente, maiorContagem);
        if (!contagemPalavrasMap.isEmpty()){
            for (String chave : contagemPalavrasMap.keySet()){
                if (contagemPalavrasMap.get(chave) > palavraMaisFrequenteContagem.get(palavraMaisFrequente)){
                    palavraMaisFrequenteContagem.remove(palavraMaisFrequente);
                    palavraMaisFrequente = chave;
                    maiorContagem = contagemPalavrasMap.get(chave);
                    palavraMaisFrequenteContagem.put(palavraMaisFrequente, maiorContagem);
                }
            }
        }
        return palavraMaisFrequenteContagem;
    }
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Jurema", 1);
        contagemPalavras.adicionarPalavra("Carlos", 4);
        contagemPalavras.adicionarPalavra("João", 8);
        contagemPalavras.adicionarPalavra("José", 3);

        contagemPalavras.exibirContagemPalavras();

        System.out.println("Palavra mais frequente: " + contagemPalavras.encontrarPalavraMaisFrequente());

    }

}