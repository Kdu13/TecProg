package atividades.atividadepratica05.exercicio02.view;

import atividades.atividadepratica04.exercicio02.model.ContaBancaria;

public class Main {
    
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        
        conta.setDepositar(1000.25, "João");
        System.out.println(conta.getDepositar());
    }
}
