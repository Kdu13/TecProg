package atividades.atividadeRevisao.revisaoP1TipoB.model;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
