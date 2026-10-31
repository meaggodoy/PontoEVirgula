package pontoevirgula.modelo;

import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {
        Livro livro = new Livro(
            "LIV001",
            "Dom Casmurro",
            10.00,
            3,
            "1112223334445",
            "Romance",
            "Machado de Assis"
        );

        ProdutoCafeteria cafe = new ProdutoCafeteria(
            "CAF001",
            "Cappuccino",
            8.00,
            10,
            "Bebida",
            "Médio",
            "Copo"
        );
        
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();
        
        gerenciador.adicionarProduto(livro);
        gerenciador.adicionarProduto(cafe);
        
        ArrayList<Produto> todos = gerenciador.listarTodos();

        for (Produto produto : todos) {
            System.out.println(produto.getCodigo() + " - " + produto.getNome());
        }
    }
}