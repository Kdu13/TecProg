package src.atividades.atividadepratica01;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];
        boolean nomeAchado = false;

        for (int contador = 0; contador < nomes.length; contador++) {

            System.out.println("Digite o " + (contador + 1) + "º nome: ");
            nomes[contador] = scan.nextLine();
        }

        System.out.println("Digite outro nome: ");
        String nomeFinal = scan.nextLine();

        for (int c = 0; c < nomes.length; c++) {
            
            if (nomeFinal.equals(nomes[c])) {
                nomeAchado = true;
            }
        }
        if(nomeAchado == true){
            System.out.println("Achei o nome: " + nomeFinal);
        }
        else{
            System.out.println("Nome não encontrado");
        }
    }
}