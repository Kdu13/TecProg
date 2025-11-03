package atividades.atividadepratica01;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String senhaSecreta = "Java123";
        String senha;

        do {
            System.out.print("Digite a senha secreta: ");
            senha = scan.nextLine();

            if(!senha.equals(senhaSecreta)){
                System.out.println("Acesso negado, tente novamente.");
            }
        }while(!senha.equals(senhaSecreta));
        System.out.println("Acesso Liberado.");
        scan.close();
    }
}