package src.atividadepratica1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else if (idade >= 60) {
            System.out.println("Idoso.");
        } else {
            System.out.println("Menor de idade.");
        }
    }
}
