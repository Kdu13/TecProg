package atividades.atividadepratica07.exercicio01.view;
import atividades.atividadepratica07.exercicio01.model.Calculadora;

public class Main01 {
    
    public static void main(String[] args) {
        
        Calculadora casio = new Calculadora(10, 4);
        System.out.println("Soma: " + casio.soma());
        System.out.println("Subtração: " + casio.subtracao());
        System.out.println("Multiplicação: " + casio.multiplicacao());
        System.out.println("Divisão: " + casio.divisao());

    }
}
