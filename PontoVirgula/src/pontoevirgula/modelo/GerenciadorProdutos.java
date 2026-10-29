package pontoevirgula.modelo;

import java.util.ArrayList;

public class GerenciadorProdutos {
    private ArrayList<Produto> produtos;
    
    //Método construtor -> Inicializa
    public GerenciadorProdutos() {
        produtos = new ArrayList<>();
    }
    
    public boolean adicionarProduto(Produto produto) {
        if (buscarPorCodigo(produto.getCodigo()) != null) {
            return false;
        }
        
        produtos.add(produto);
        return true;
    }
    
    public Produto buscarPorCodigo(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        
        return null;
    }
    
    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
        }
    }
}
