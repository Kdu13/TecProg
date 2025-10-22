package atividades.atividadeRevisao.revisaoP1TipoB.view;
import atividades.atividadeRevisao.revisaoP1TipoB.model.Livro;
import atividades.atividadeRevisao.revisaoP1TipoB.model.SuperMercado;
import atividades.atividadeRevisao.revisaoP1TipoB.model.Funcionario;

public class Main {
    
    public static void main(String[] args) {
        Livro harryPotter = new Livro();
        harryPotter.titulo = "Harry Potter e o Prisioneiro de Azkaban";
        harryPotter.autor = "J.K. Rowlling";
        harryPotter.anoPublicaçao = 1999;

        System.out.println("Livro: " + harryPotter.titulo + "\nAutor(a): " + harryPotter.autor + "\nAno de publicação: " + harryPotter.anoPublicaçao);


        Funcionario caio = new Funcionario();
        caio.setNome("Caio");
        caio.setSalario(15000.00);
        caio.setCargo("Dev Senior");

        System.out.println("Nome: " + caio.getNome() + "\nSalario: " + caio.getSalario() + "\nCargo: " + caio.getCargo());


        String[] nomes = {"Arroz", "Feijão", "Macarrão"};
        double[] precos = {20.0, 10.0, 8.0};
        double[] descontos = {0.10, 0.20, 0.05};

        SuperMercado extra = new SuperMercado(nomes, precos, descontos);

        System.out.println("=== Lista de Produtos ===");
        for (String p : extra.listarProdutos()) {
            System.out.println(p);
        }

        System.out.println("\nTotal da compra com descontos: R$" +
                           extra.calcularTotalComDesconto());

        System.out.println("\n" + extra.produtoMaiorEconomia());

        if (extra.comprarProduto("Feijão")) {
            System.out.println("\nFeijão comprado!");
        }
        for (String p : extra.listarProdutos()) {
            System.out.println(p);
        }

        extra.reporProduto("Feijão", 10.0, 0.20);
        System.out.println("\nFeijão reposto!");
        for (String p : extra.listarProdutos()) {
            System.out.println(p);
        }
    
}

}