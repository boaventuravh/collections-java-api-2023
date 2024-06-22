package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    public Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado co : convidados) {
            if (co.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = co;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        for (Convidado co : convidados) {
            System.out.println(co.getNome() + ", " + co.getCodigoConvite());
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("Alfredo", 3);
        conjuntoConvidados.adicionarConvidado("Joana", 4);
        conjuntoConvidados.adicionarConvidado("Outra Joana", 4);

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Total de convidados: " + conjuntoConvidados.contarConvidados());
    }
}
