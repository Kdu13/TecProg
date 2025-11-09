package atividades.atividadepratica10.exercicio01.view;
import atividades.atividadepratica10.exercicio01.model.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.adicionarCliente("Carlos", "carlos@exemplo.com");
        empresa.adicionarCliente("Caio", "caio@exemplo.com");
        empresa.adicionarCliente("Geovanny", "geovanny@exemplo.com");
        empresa.adicionarCliente("Eduardo", "eduardo@exemplo.com");
        empresa.adicionarCliente("Weverton", "weverton@exemplo.com");

        System.out.println("Clientes cadastrados:");
        empresa.exibirClientes();

    }
}

