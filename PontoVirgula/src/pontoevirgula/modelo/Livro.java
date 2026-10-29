package pontoevirgula.modelo;

public class Livro extends Produto {
    private String isbn;
    private String genero;
    private String autor;
    
    public Livro(String codigo, String nome, double preco, int quantidadeEstoque, String isbn, String genero, String autor) {
        super(codigo, nome, preco, quantidadeEstoque);
        this.isbn = isbn;
        this.genero = genero;
        this.autor = autor;
    }
    
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }
    
    public String getISBN() {
        return isbn;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAutor() {
        return autor;
    }
}