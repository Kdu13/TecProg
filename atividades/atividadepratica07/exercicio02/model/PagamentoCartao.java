package atividades.atividadepratica07.exercicio02.model;

public class PagamentoCartao implements IPagamento {
    
    private double valor;
    private double taxa;

    public PagamentoCartao(double valor, double taxa){
        this.valor = valor;
        this.taxa = taxa;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getTaxa(){
        return taxa;
    }

    public void setTaxa(double taxa){
        this.taxa = taxa;
    }


    public double calcularPagamento(){
        return this.valor + (this.valor * this.taxa);
    }

    public String emitirRecibo(){
        return "Valor original: R$" + valor + "\nValor com taxa: " + calcularPagamento();
    }
}
