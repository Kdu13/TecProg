package atividades.atividadepratica05.exercicio02.view;

import atividades.atividadepratica05.exercicio02.model.ContaBancaria;

public class Main {
    
    public static void main(String[] args) {
        
        ContaBancaria nubank = new ContaBancaria();
        
        nubank.setDepositar(1550.25 , " Carlos");

        nubank.setSaldo(nubank.getSaldo());

        nubank.setSacar(530.00 , " Carlos");

        nubank.setSaldo(nubank.getSaldo());
    }
}
