package pontoevirgula.modelo;

public class ProdutoCafeteria extends Produto {
    private String categoria;
    private String tamanho;
    private String unidadeVenda;
    
    public ProdutoCafeteria(String codigo, String nome, double preco, int quantidadeEstoque, String categoria, String tamanho, String unidadeVenda) {
        super(codigo, nome, preco, quantidadeEstoque);
        this.categoria = categoria;
        this.tamanho = tamanho;
        this.unidadeVenda = unidadeVenda;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getTamanho() {
        return tamanho;
    }
    
    public void setUnidadeVenda(String unidadeVenda) {
        this.unidadeVenda = unidadeVenda;
    }
    
    public String getUnidadeVenda() {
        return unidadeVenda;
    }
}