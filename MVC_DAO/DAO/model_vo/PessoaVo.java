package model_vo;

public class PessoaVo {

	//atributos
	private String nome;
	private String cpf;
	private int idade;
	
	//construtor
	public PessoaVo(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	//Metodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}

