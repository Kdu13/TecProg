package atividades.atividadepratica06.exercicio01.model;

/*Exercício 1 – Loja com Estoque e Estatísticas
Crie uma classe Loja com:

Um array de String chamado nomesProdutos;
Um array de int chamado quantidadeEstoque;
Um array de double chamado precosProdutos.
Implemente métodos para:

Exibir todos os produtos com preços e quantidades em estoque.
Calcular o produto mais caro e o mais barato da loja.
Calcular o valor total em estoque (preço × quantidade de cada item).
Comprar um produto, diminuindo sua quantidade em estoque.
Repor um produto, aumentando a quantidade em estoque.*/


public class Loja {
    private String[] nomesProdutos;
    private int[] quantidadeEstoque;
    private double[] precosProdutos;


    public String[] getExibirProdutos(){
        return this.nomesProdutos;
    }

    public void setExibirProdutos(){

    }


    //Calcular produto mais caro
    public double[] getCalcularProdutoCaro(){
        return this.precosProdutos;
    }

    public void setCalcularProdutoCaro(){
        
    }


    //Calcular valor total
    public double[] getCalcularValorTotal(){
        return this.precosProdutos;
    }

    public void setCalcularValorTotal(){
        
    }


    //Compra de um produto
    public double[] getCompraProduto(){
        return precosProdutos;
    }

    public void setCompraProduto(){
        
    }


    //Repor um produto
    public int[] getReporProduto(){
        return this.quantidadeEstoque;
    }

    public void setReporProduto(){
        
    }
    
}
