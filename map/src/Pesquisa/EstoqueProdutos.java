package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0D;
        if(!estoqueProdutosMap.isEmpty())
        {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotal += (p.getPreco() * p.getQuantidade());
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValor = null;
        double maiorQuantidadeValor = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if ((p.getPreco() * p.getQuantidade()) > maiorQuantidadeValor){
                    produtoMaiorQuantidadeValor = p;
                    maiorQuantidadeValor = (p.getQuantidade() * p.getPreco());
                }
            }
        }
        return produtoMaiorQuantidadeValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Amaciante", 3, 10);
        estoqueProdutos.adicionarProduto(2L, "Escova", 2, 20);
        estoqueProdutos.adicionarProduto(3L, "Cotonete", 4, 15);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total estoque: " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }


}
