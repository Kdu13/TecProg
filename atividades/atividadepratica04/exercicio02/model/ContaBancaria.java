package atividades.atividadepratica04.exercicio02.model;

public class ContaBancaria {
    
    public String nomeCliente;
    public int saldo;

    public void exibirSaldo(){
        System.out.println("Exibindo saldo do cliente: " + nomeCliente + " Saldo: R$" + saldo + " reais.");
    }

    public void setDepositar(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDepositar'");
    }

    public char[] getDepositar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDepositar'");
    }
}
