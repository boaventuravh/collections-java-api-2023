package compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> listaItens;

    public CarrinhoCompras(){
        listaItens = new ArrayList<>();
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void adicionarItem(String nome, int quantidade, double preco){
        listaItens.add(new Item(nome, quantidade, preco));
    }

    public void removerItem(String nome){
        listaItens.removeIf(item -> item.getNome().equals(nome));
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        if (!listaItens.isEmpty())
            for (Item i : listaItens)
                valorTotal += i.getPreco()*i.getQuantidade();

        return valorTotal;
    }

    public void exibirItens(){
        for(Item i : listaItens)
            System.out.println("Nome: " + i.getNome() + ", preço: " + i.getPreco() + ", quantidade: " + i.getQuantidade());
    }
}
