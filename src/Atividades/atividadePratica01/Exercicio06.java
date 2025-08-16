package src.atividades.atividadepratica01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
