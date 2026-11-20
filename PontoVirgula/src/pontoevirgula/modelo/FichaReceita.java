package pontoevirgula.modelo;

import java.util.ArrayList;

public class FichaReceita {
    private int idFichaReceita;
    private ArrayList<ItemFichaReceita> itens;
    
    public FichaReceita(int idFichaReceita) {
        this.idFichaReceita = idFichaReceita;
        this.itens = new ArrayList<>();
    }
    
    public void setIdFichaReceita(int idFichaReceita) {
        this.idFichaReceita = idFichaReceita;
    }
    
    public int getIdFichaReceita() {
        return idFichaReceita;
    }
    
    public void adicionarItem(ItemFichaReceita item) {
        itens.add(item);
    }
    
    public ArrayList<ItemFichaReceita> getItens() {
        return itens;
    }
    
    public double calcularCustoReceita() {
        double custoReceita = 0;
        
        for (ItemFichaReceita item : itens) {
            custoReceita = custoReceita + item.calcularCustoIngredienteUtilizado();
        }
        
        return custoReceita;
    }
}