package pontoevirgula.modelo;

import java.util.ArrayList;

public class ProdutoCafeteria extends Produto {
    private String categoria;
    private String subCategoria;
    private ArrayList<VariacaoProduto> variacoes;
    
    public ProdutoCafeteria(String codigo, String nome, double preco, String categoria, String subCategoria) {
        super(codigo, nome, preco);
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.variacoes = new ArrayList<>();
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }
    
    public String getSubCategoria() {
        return subCategoria;
    }
    
    public void adicionarVariacao(VariacaoProduto variacao) {
        variacoes.add(variacao);
    }
    
    public ArrayList<VariacaoProduto> getVariacoes() {
        return variacoes;
    }
}