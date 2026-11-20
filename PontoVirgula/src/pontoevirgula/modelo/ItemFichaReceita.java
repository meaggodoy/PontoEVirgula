package pontoevirgula.modelo;

public class ItemFichaReceita {
    private Ingrediente ingrediente;
    private double quantidadeUtilizada;
    
    public ItemFichaReceita(Ingrediente ingrediente, double quantidadeUtilizada) {
        this.ingrediente = ingrediente;
        this.quantidadeUtilizada = quantidadeUtilizada;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    public void setQuantidadeUtilizada(double quantidadeUtilizada) {
        this.quantidadeUtilizada = quantidadeUtilizada;
    }
    
    public double getQuantidadeUtilizada() {
        return quantidadeUtilizada;
    }
    
    public double calcularCustoIngredienteUtilizado() {
        return quantidadeUtilizada * ingrediente.getCustoUnitario();
    }
}
