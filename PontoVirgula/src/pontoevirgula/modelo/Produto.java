package pontoevirgula.modelo;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    public Produto() {
        codigo = "";
        nome = "";
        preco = 0.00;
        quantidadeEstoque = 0;
    }
    
    public Produto(String codigo, String nome, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setPreco(double preco) {
        if (preco < 0){
            throw new IllegalArgumentException("O preço não pode ser negativo!");
        }
        
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
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