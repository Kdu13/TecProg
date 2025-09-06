package atividades.atividadepratica05.exercicio02.model;

public class ContaBancaria {
    private double saldo;
    private String titular;


    public double depositar() {
        return this.saldo;
    }

    public void depositar(double novoDeposito, String titular) {
        if(novoDeposito > 0) {
            this.saldo += novoDeposito;
            System.out.println("Depósito realizado com sucesso." + titular);
        } else {
            System.out.println("Depósito inválido." + titular);
        }
    }

    public double getSacar() {
        return this.saldo;
    }

    public void setSacar(double novoSaque, String titular) {
        if (novoSaque > 0 && novoSaque <= this.saldo) {
            this.saldo -= novoSaque;
            System.out.println("Saque realizado com sucesso." + titular);
        } else {
            System.out.println("Saque inválido.");
        }
    }

    

    

    

    

}
