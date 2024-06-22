package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        if (!palavrasUnicasSet.contains(palavra)){
            palavrasUnicasSet.add(palavra);
        }
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;

        for (String s : palavrasUnicasSet) {
            if (s.equals(palavra)){
                palavraParaRemover = s;
                break;
            }
        }
        palavrasUnicasSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        for (String s : palavrasUnicasSet){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra");
        conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("Word");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        String palavraQualquer = "Abacaxi";
        System.out.println("A palavra " + palavraQualquer + " está contida no conjunto: " + conjuntoPalavrasUnicas.verificarPalavra(palavraQualquer));

        conjuntoPalavrasUnicas.removerPalavra(palavraQualquer);
        System.out.println("A palavra " + palavraQualquer + " está contida no conjunto: " + conjuntoPalavrasUnicas.verificarPalavra(palavraQualquer));
    }
}
