package pontoevirgula.modelo;

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
        boolean primeiro = gerenciador.adicionarProduto(livro);
        System.out.println("1 - " + primeiro);
        
        boolean segundo = gerenciador.adicionarProduto(cafe);
        System.out.println("2 - " + segundo);
        
        boolean terceiro = gerenciador.adicionarProduto(livro);
        System.out.println("3 - " + terceiro);
        
        gerenciador.listarProdutos();
    }
}