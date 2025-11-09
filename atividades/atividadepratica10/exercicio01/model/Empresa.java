package atividades.atividadepratica10.exercicio01.model;

public class Empresa {
    private Cliente[] clientes;
    private int contador;

    public Empresa() {
        this.clientes = new Cliente[5];
        this.contador = 0;
    }

    public boolean adicionarCliente(String nome, String email) {
        if (contador >= clientes.length) {
            return false;
        }
        clientes[contador++] = new Cliente(nome, email);
        return true;
    }

    public void exibirClientes() {
        if (contador == 0) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println((i+1) + ". " + clientes[i]);
        }
    }
}
