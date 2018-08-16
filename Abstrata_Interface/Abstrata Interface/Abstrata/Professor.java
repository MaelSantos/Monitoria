package Abstrata;

public class Professor extends Pessoa {

	public Professor(String nome, String sexo, int idade) {
		super(nome, sexo, idade);		
	}
	
	@Override
	public String falar() {
		return "Sou Um Professor [ "+getNome()+" ]";
	}

}
