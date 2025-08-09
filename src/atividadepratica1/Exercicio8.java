package src.atividadepratica1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        int numImpar = 1;
        int soma = 0;

        for (int contador = 0; contador < num; contador++) {

            soma += numImpar;
            numImpar += 2;
        }

        System.out.println("A soma dos números impares é: " + soma);
    }
}
