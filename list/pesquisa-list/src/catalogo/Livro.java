package catalogo;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicação;

    public Livro(String titulo, String autor, int anoPublicação){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicação = anoPublicação;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicação() {
        return anoPublicação;
    }
}
