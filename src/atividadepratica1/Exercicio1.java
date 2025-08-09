package src.atividadepratica1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = scan.nextInt();

		if (num > 0) {
			System.out.println("O número é positivo.");
		} else if (num < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número é zero.");
		}
	}
}