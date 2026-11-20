package pontoevirgula.modelo;


public class Ingrediente {
    private int idIngrediente;
    private String nome;
    private String unidadeMedida;
    private double custoUnitario;
    private double quantidadeEstoque;
    
    public Ingrediente(int idIngrediente, String nome, String unidadeMedida, double custoUnitario, double quantidadeEstoque) {
        this.idIngrediente = idIngrediente;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.custoUnitario = custoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }
    
    public int getIdIngrediente() {
        return idIngrediente;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    
    public void setCustoUnitario(double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }
    
    public double getCustoUnitario() {
        return custoUnitario;
    }
    
    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
