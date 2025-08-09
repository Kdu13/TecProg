package src.atividadepratica1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha entre 1(calcular area do quadrado) e 2(calcular area do circulo)");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o lado do quadrado:");
                double lado = scan.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;

            case 2:
                System.out.println("Digite o raio do círculo:");
                double raio = scan.nextDouble();
                double areaCirculo = (raio * raio) * 3.14159;
                System.out.println("A área do círculo é: " + areaCirculo);
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                break;
        }
    }
}
