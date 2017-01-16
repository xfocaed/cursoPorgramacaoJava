package Biblioteca;

public class Biblioteca {

    Livro[] acervo;

    public Biblioteca() {
        acervo = new Livro[100];
    }

    public boolean adicionarLivro(Livro l) {
        int i = 0;
        Livro encontrado = buscarLivro(l.codigo);
        
        if (encontrado!=null) 
        {
        	return false;
        }
        
        while ((acervo[i] != null) && (i < acervo.length - 1)) {
        	/*if (l.getCodigo().matches(acervo[i].getCodigo()))
        			{
        		      return false;
        			}*/
            i++;
        }

        if (i == acervo.length - 1) {
            return false;
        }

        acervo[i] = l;
        return true;
    }

    public Livro buscarLivro(String codigo) {
        int i = 0;
        
        
        
        while ((!acervo[i].codigo.matches(codigo)) && (i < acervo.length - 1)) {
            i++;
        }

        if (i == acervo.length - 1) {
            return null;
        }

        return acervo[i];
    }

    public boolean removerLivro(String codigo) {
        int i = 0;
        while ((!acervo[i].codigo.matches(codigo)) && (i < acervo.length - 1)) {
            i++;
        }

        if (i == acervo.length - 1) {
            return false;
        }
        acervo[i] = null;
        return true;
    }

    public void listarAcervo() {
        System.out.println("LISTAGEM DO ACERVO");
        for (Livro l : acervo) {
           if (l != null)
            System.out.println(l.codigo + " " + l.titulo + " " + l.autor);
        }
       
    }
}