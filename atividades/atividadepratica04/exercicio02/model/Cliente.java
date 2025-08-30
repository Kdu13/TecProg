package atividades.atividadepratica04.exercicio02.model;

public class Cliente {
    
    public int idade;

    public void pagar(){
        if(idade >= 18){
            System.out.println("Você pode consumir bebidas alcoólicas.");
        } else {
            System.out.println("Voce não pode consumir bebidas alcoólicas.");
        }
    }
}
