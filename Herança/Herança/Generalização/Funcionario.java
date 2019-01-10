package Generalização;

public abstract class Funcionario {

	//atributos
	protected String nome;
	protected double salario;
	
	//construtor 
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	//metodo abstract
	public String cargo() {
		return "Funcionario";
	}
	
	//metodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
