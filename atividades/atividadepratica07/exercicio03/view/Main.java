package atividades.atividadepratica07.exercicio03.view;
import atividades.atividadepratica07.exercicio03.model.SistemaDeSeguranca;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    boolean logado = false;
    SistemaDeSeguranca face = new SistemaDeSeguranca("Adm", "1234");

    while (!logado) {
        System.out.println("Usuário: ");
        String usuario = entrada.nextLine();

        System.out.println("Senha: ");
        String senha = entrada.nextLine();

        logado = face.login(usuario, senha);
    }

    System.out.println("Logado com Sucesso " + face.getUsuario());

    System.out.println("Deseja deslogar (s/n)? ");
    String decisao = entrada.nextLine();

    if(decisao.equals("s")){
        face.logout();
    }

    entrada.close();

   }
}
