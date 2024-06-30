package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        for (Aluno a : alunosSet){
            if (a.getMatricula() == matricula){
                alunosSet.remove(a);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<Aluno>(alunosSet);
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Jamelão", 1111L, 8.5);
        gerenciadorAlunos.adicionarAluno("Karla", 2222L, 9.5);
        gerenciadorAlunos.adicionarAluno("August", 3333L, 10.0);
        gerenciadorAlunos.adicionarAluno("Baggio", 3333L, 1.0);
        gerenciadorAlunos.adicionarAluno("Baggio", 4444L, 1.5);


        gerenciadorAlunos.exibirAlunos();

        var alunosPorNome = gerenciadorAlunos.exibirAlunosPorNome();
        System.out.println(alunosPorNome);

        var alunosPorNota = gerenciadorAlunos.exibirAlunosPorNota();
        System.out.println(alunosPorNota);

        gerenciadorAlunos.removerAluno(3333);

        System.out.println(alunosPorNome);

        System.out.println(alunosPorNota);


    }

}
