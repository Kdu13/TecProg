package src.atividadepratica1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        for (int contador = 1; contador <= 10; contador++) {
            System.out.println(num + " x " + contador + " = " + (num * contador));
        }

    }
}
