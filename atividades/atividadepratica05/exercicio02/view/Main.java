package atividades.atividadepratica05.exercicio02.view;

import atividades.atividadepratica05.exercicio02.model.ContaBancaria;

public class Main {
    
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        
        conta.setDepositar(1550.25 , " Carlos");

        conta.setSaldo(conta.getSaldo());

        conta.setSacar(530.00 , " Carlos");

        conta.setSaldo(conta.getSaldo());
    }
}
