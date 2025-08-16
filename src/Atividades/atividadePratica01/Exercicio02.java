package src.Atividades.atividadepratica01;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		int num1 = scan.nextInt();

		System.out.print("Digite o segundo numero: ");
		int num2 = scan.nextInt();

		if (num1 == num2) {
			System.out.println("Os numeros são iguais");
		} else if (num1 > num2) {
			System.out.println("Os números são diferentes e o primeiro valor é maior");
		} else {
			System.out.println("Os números são diferentes e o segundo valor é maior");
		}
	}
}