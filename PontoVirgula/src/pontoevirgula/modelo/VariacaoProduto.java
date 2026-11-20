package pontoevirgula.modelo;

public class VariacaoProduto {
    private int idVariacao;
    private String tamanho;
    private double quantidadePorcao;
    private String unidadeMedida;
    private double ajustePreco;
    private FichaReceita fichaReceita;
    
    public VariacaoProduto(int idVariacao, String tamanho, double quantidadePorcao, String unidadeMedida, double ajustePreco) {
        this.idVariacao = idVariacao;
        this.tamanho = tamanho;
        this.quantidadePorcao = quantidadePorcao;
        this.unidadeMedida = unidadeMedida;
        this.ajustePreco = ajustePreco;
    }
    
    public void setIdVariacao(int idVariacao) {
        this.idVariacao = idVariacao;
    }
    
    public int getIdVariacao() {
        return idVariacao;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getTamanho() {
        return tamanho;
    }
    
    public void setQuantidadePorcao(double quantidadePorcao) {
        this.quantidadePorcao = quantidadePorcao;
    }
    
    public double getQuantidadePorcao() {
        return quantidadePorcao;
    }
    
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    
    public void setAjustePreco(double ajustePreco) {
        this.ajustePreco = ajustePreco;
    }
    
    public double getAjustePreco() {
        return ajustePreco;
    }
    
    public double calcularPrecoFinal(double precoBase) {
        return precoBase + ajustePreco;
    }

    public FichaReceita getFichaReceita() {
        return fichaReceita;
    }

    public void setFichaReceita(FichaReceita fichaReceita) {
        this.fichaReceita = fichaReceita;
    }
}
