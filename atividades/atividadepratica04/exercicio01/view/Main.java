package atividades.atividadepratica04.exercicio01.view;
import atividades.atividadepratica04.exercicio01.model.Carro;

public class Main {
    public static void main(String[] args){

        Carro civic = new Carro();
        civic.modelo = "civic";
        civic.cor = "Black";
        civic.capacidadeTanque = 53;

        Carro sandero = new Carro();
        sandero.modelo= "Sandero";
        sandero.cor = "Silver";
        sandero.capacidadeTanque = 41;

        civic.desligar();
        civic.freiar();
        civic.acelerar();
        civic.ligar();
        civic.buzinar();
        civic.freiar();
        civic.desligar();
        
    }
}