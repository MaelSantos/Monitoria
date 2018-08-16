package Interface;

public abstract class Pessoa implements Acao{

	//atributos
	private String nome;
	private String sexo;
	private int idade;
	
	//contrutor 
	public Pessoa(String nome, String sexo, int idade) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	//metodos getters e setters
	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public int getIdade() {
		return idade;
	}
}
