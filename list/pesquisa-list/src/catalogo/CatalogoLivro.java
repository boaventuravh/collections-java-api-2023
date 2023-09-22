package catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> acervoLivros;

    public CatalogoLivro(){
        acervoLivros = new ArrayList<>();
    }

    public List<Livro> getAcervoLivros() {
        return acervoLivros;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        acervoLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosEncontrados = new ArrayList<>();

        for(Livro li : acervoLivros)
            if (li.getAutor().equalsIgnoreCase(autor))
                livrosEncontrados.add(li);

        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervalo = new ArrayList<>();

        for (Livro li : acervoLivros)
            if (li.getAnoPublicação() >= anoInicial && li.getAnoPublicação() <= anoFinal)
                livrosIntervalo.add(li);

        return livrosIntervalo;
    }

    //Esse método pesquisarPorTitulo() pode ganhar em performance utilizando a busca
    //binária. É algo para se ter em mente e implementar mais adiante
    public Livro pesquisarPorTitulo(String titulo){
        for (Livro li : acervoLivros)
            if (li.getTitulo().equalsIgnoreCase(titulo))
                return li;

        return null;
    }
}
