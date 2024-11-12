package main.list.Pesquisa;

public class Livro {
    //atributo
    private String titulo;
    private String autor;
    private int anopublicacao;

    //construtor
    public Livro(String titulo, String autor, int anopublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anopublicacao = anopublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnopublicacao() {
        return anopublicacao;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anopublicacao=" + anopublicacao + "]";
    }

    
    

    
}
