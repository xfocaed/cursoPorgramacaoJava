package Biblioteca;

public class Livro {

    String autor;
    String titulo;
    String publicacao;
    String codigo;
   
    Livro(String autor, String tit, String pub, String codigo)
    {
        this.autor = autor;
        this.titulo = tit;
        this.publicacao = pub;
        this.codigo = codigo;
    }
   
    public String getCodigo()
    {
        return this.codigo;
    }
}