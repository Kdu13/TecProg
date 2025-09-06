package atividades.atividadepratica05.exercicio03.view;
import atividades.atividadepratica05.exercicio03.model.Produto;

public class Main {
     public static void main(String[] args) {
        Produto camisa = new Produto();

        camisa.setNome("Camisa Polo");

        camisa.setPreco(59.99);
        
        camisa.setEstoque(100);
    }
}
