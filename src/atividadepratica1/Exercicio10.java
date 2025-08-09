package src.atividadepratica1;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String senhaSecreta = "Java123";
        String senha;

        do {
            System.out.print("Digite a senha secreta: ");
            senha = scan.nextLine();

            if(senha.equals(senhaSecreta)){
                System.out.println("Acesso permitido");
            }
            else{
                System.out.println("Acesso negado");
            }
        }while(!senha.equals(senhaSecreta));
    }
}