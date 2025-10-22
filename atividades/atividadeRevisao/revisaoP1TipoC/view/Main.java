package atividades.atividadeRevisao.revisaoP1TipoC.view;
import atividades.atividadeRevisao.revisaoP1TipoC.model.Celular;
import atividades.atividadeRevisao.revisaoP1TipoC.model.ContaBancaria;
import atividades.atividadeRevisao.revisaoP1TipoC.model.PostoCombustivel;

public class Main {
    public static void main(String[] args) {
        
        Celular motorola = new Celular();
        motorola.marca = "Motorola";
        motorola.modelo = "Moto G 5G";
        motorola.preco = 1599.99;
        
        System.out.println("Marca: " + motorola.marca + "\nModelo: " + motorola.modelo + "\nPreço: " + motorola.preco);


        ContaBancaria nubank = new ContaBancaria();
        nubank.setTitular("Maria Santos");
        nubank.setNumeroConta(98765);
        nubank.setSaldo(2500.75);
        
        System.out.println("Titular: " + nubank.getTitular());
        System.out.println("Número da Conta: " + nubank.getNumeroConta());
        System.out.println("Saldo: R$ " + nubank.getSaldo());
        
        System.out.println("\nAtualizando saldo...\n");
        nubank.setSaldo(3000.00);
        System.out.println("Novo Saldo: R$ " + nubank.getSaldo());


        String[] tipos = {"Gasolina", "Etanol", "Diesel"};
        double[] precos = {5.89, 4.29, 6.15};
        int[] litros = {5000, 3000, 4000};
        
        PostoCombustivel ipiranga = new PostoCombustivel(tipos, precos, litros);
        
        ipiranga.exibirCombustiveis();
        
        double valorTotal = ipiranga.calcularValorTotalEstoque();
        System.out.println("\nVALOR TOTAL EM ESTOQUE: R$ " + valorTotal);

        ipiranga.analisarEstoque();
        ipiranga.venderCombustivel(0, 50);
        ipiranga.reabastecerBomba(1, 2000);
        ipiranga.exibirCombustiveis();
        ipiranga.analisarEstoque();
        
        valorTotal = ipiranga.calcularValorTotalEstoque();
        System.out.println("\nVALOR TOTAL ATUALIZADO: R$ " + valorTotal);
    }
}
