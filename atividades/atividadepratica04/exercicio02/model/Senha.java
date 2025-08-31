package atividades.atividadepratica04.exercicio02.model;

public class Senha {
    
    public String senhaUsuario;
    public String senhaValida;

    public void validarSenha(){
        if(senhaUsuario.equals(senhaValida)){
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");
        }
    }
}
