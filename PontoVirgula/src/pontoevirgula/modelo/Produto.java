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
    }
    
    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        setPreco(preco);
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
}