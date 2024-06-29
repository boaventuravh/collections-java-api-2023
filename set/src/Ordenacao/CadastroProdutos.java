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

    

    public Set<Produto> ordenarProdutosPorNome(){
        Set<Produto> produtosOrdenadosNome = new TreeSet<Produto>(produtosSet);
        return produtosOrdenadosNome;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1234, "Martelo", 27.5, 5);
        cadastroProdutos.adicionarProduto(1234, "Marteloo", 38.5, 6);
        cadastroProdutos.adicionarProduto(1235, "Martelooo", 14.4, 9);

        cadastroProdutos.exibirProdutosPorNome();

    }

}
