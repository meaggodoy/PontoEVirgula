package pontoevirgula.modelo;

public class ProdutoLivro extends Produto {
    private String isbn;
    private String genero;
    private String autor;
    private int quantidadeEstoque;
    private String editora;
    private int edicao;
    private String idioma; 
    
    public ProdutoLivro(String codigo, String nome, double preco, int quantidadeEstoque, String isbn, String genero, String autor, String editora, int edicao, String idioma) {
        super(codigo, nome, preco);
        this.isbn = isbn;
        this.genero = genero;
        this.autor = autor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.editora = editora;
        this.edicao = edicao;
        this.idioma = idioma;
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
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public String getEditora() {
        return editora;
    }
    
    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }
    
    public Integer getEdicao() {
        return edicao;
    }
    
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    public String getIdioma() {
        return idioma;
    }
    
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0){
            throw new IllegalArgumentException("A quantidade para lançamento em estoque não pode ser negativa!");
        }
        
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}