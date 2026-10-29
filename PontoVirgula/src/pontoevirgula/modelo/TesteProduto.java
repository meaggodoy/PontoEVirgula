package pontoevirgula.modelo;

public class TesteProduto {
    public static void main(String[] args) {
        Livro testeLivro = new Livro(
                "LIV001",
                "Dom Casmurro",
                10.00,
                3,
                "1112223334445",
                "Romance",
                "Machado de Assis"
        );
        
        System.out.println(testeLivro.getCodigo());
        System.out.println(testeLivro.getNome());
        System.out.println(testeLivro.getPreco());
        System.out.println(testeLivro.getQuantidadeEstoque());
        System.out.println(testeLivro.getISBN());
        System.out.println(testeLivro.getGenero());
        System.out.println(testeLivro.getAutor());
        
        ProdutoCafeteria testeCafe = new ProdutoCafeteria(
            "CAF001",
            "Cappuccino",
            8.00,
            10,
            "Bebida",
            "Médio",
            "Copo"
        );

        System.out.println(testeCafe.getCodigo());
        System.out.println(testeCafe.getNome());
        System.out.println(testeCafe.getPreco());
        System.out.println(testeCafe.getQuantidadeEstoque());
        System.out.println(testeCafe.getCategoria());
        System.out.println(testeCafe.getTamanho());
        System.out.println(testeCafe.getUnidadeVenda());
    }
}