package atividades.atividadepratica04.exercicio02.model;

public class ContaBancaria {
    
    public String nomeCliente;
    public int saldo;

    public void exibirSaldo(){
        System.out.println("Exibindo saldo do cliente: " + nomeCliente + " Saldo: R$" + saldo + " reais.");
    }
}
