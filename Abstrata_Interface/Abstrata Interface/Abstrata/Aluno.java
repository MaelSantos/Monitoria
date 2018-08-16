package Abstrata;

public class Aluno extends Pessoa {

	public Aluno(String nome, String sexo, int idade) {
		super(nome, sexo, idade);		
	}

	@Override
	public String falar() {
		 return "Sou Um Aluno [ "+getNome()+" ]";
	}

}
