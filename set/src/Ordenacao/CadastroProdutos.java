package Ordenacao;

import java.util.*;

public class CadastroProdutos {

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutosPorNome(){
        var produtosOrdenadosPorNome = this.ordenarProdutosPorNome();
        System.out.println(produtosOrdenadosPorNome);
    }

    

    public TreeSet<Produto> ordenarProdutosPorNome(){
        TreeSet<Produto> produtosOrdenadorPorNome = new TreeSet<Produto>(
                new Comparator<Produto>(){
                    @Override
                    public int compare(Produto o1, Produto o2) {
                        return o1.getNome().compareTo(o2.getNome());
                    }
                });
        produtosOrdenadorPorNome.addAll(produtosSet);
        return produtosOrdenadorPorNome;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1234, "Martelo", 27.5, 5);
        cadastroProdutos.adicionarProduto(1234, "Marteloo", 38.5, 6);
        cadastroProdutos.adicionarProduto(1235, "Martelooo", 14.4, 9);

        cadastroProdutos.exibirProdutosPorNome();

    }

}
