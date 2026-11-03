package pontoevirgula.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GerenciadorProdutos {
    private ArrayList<Produto> produtos;
    
    //Método construtor -> Inicializa
    public GerenciadorProdutos() {
        produtos = new ArrayList<>();
    }
    
    public boolean adicionarProduto(Produto produto) {
        if (!buscarPorCodigo(produto.getCodigo()).isEmpty()) {
            return false;
        }
        
        produtos.add(produto);
        return true;
    }
    
    public ArrayList<Produto> buscarPorCodigo(String codigo) {
        ArrayList<Produto> encontrados = new ArrayList<>();
        
        if (codigo == null || codigo.trim().isEmpty()) {
            return encontrados;
        }
        
        codigo = codigo.trim().toLowerCase();
        
        for (Produto produto : produtos) {
            if (produto.getCodigo().toLowerCase().contains(codigo.toLowerCase())) {
                encontrados.add(produto);
            }
        }
        
        return encontrados;
    }
    
    public ArrayList<Produto> buscarPorNome(String nome) {
        ArrayList<Produto> encontrados = new ArrayList<>();
        
        if (nome == null || nome.trim().isEmpty()) {
            return encontrados;
        }
        
        nome = nome.trim().toLowerCase();
        
        for (Produto produto : produtos) {            
            if (produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
                encontrados.add(produto);
            }
        }

        return encontrados;
        
    }
    
    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
        }
    }
    
    public ArrayList<Produto> listarTodos() {
        ArrayList<Produto> lista = new ArrayList<>(produtos);
        
        Collections.sort(lista, Comparator.comparing((Produto p) -> p.getCodigo().replaceAll("\\d+", ""))
        .thenComparingInt(p -> Integer.parseInt(p.getCodigo().replaceAll("\\D+", ""))));
        
        return lista;
    }
}
