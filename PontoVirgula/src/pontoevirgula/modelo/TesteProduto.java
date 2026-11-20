package pontoevirgula.modelo;

import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {
        Ingrediente leite = new Ingrediente(1, "Leite integral", "ml", 0.005, 5000);
        ItemFichaReceita itemLeite = new ItemFichaReceita(leite, 150);
        Ingrediente cafe = new Ingrediente(2, "Café", "g", 0.05, 2000);
        Ingrediente chocolate = new Ingrediente(3, "Chocolate em pó", "g", 0.03, 1500);
        ItemFichaReceita itemCafe = new ItemFichaReceita(cafe, 18);
        ItemFichaReceita itemChocolate = new ItemFichaReceita(chocolate, 20);
        
        FichaReceita ficha = new FichaReceita(1);
        ficha.adicionarItem(itemLeite);
        ficha.adicionarItem(itemCafe);
        ficha.adicionarItem(itemChocolate);
        
        System.out.println("Quantidade de itens na lista: " + ficha.getItens().size());
        
        VariacaoProduto variacao = new VariacaoProduto(1, "Médio", 200, "ml", 0);
        variacao.setFichaReceita(ficha);
        
        System.out.println("Id da ficha receita: " + variacao.getFichaReceita().getIdFichaReceita());
        
        ProdutoCafeteria cappuccino = new ProdutoCafeteria(
            "C001", "Cappuccino", 12.00, "Bebidas", "Cafés"
        );
        
        cappuccino.adicionarVariacao(variacao);
        System.out.println("Quantidade de variações: " + cappuccino.getVariacoes().size());
        System.out.println("Preço final: R$ " + variacao.calcularPrecoFinal(cappuccino.getPreco()));
        System.out.println("Custo do leite utilizado: R$ " + itemLeite.calcularCustoIngredienteUtilizado());
        System.out.println("Custo cappuccino: " + ficha.calcularCustoReceita());
    }
}