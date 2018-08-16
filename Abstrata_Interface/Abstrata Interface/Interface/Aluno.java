package Interface;

public class Aluno extends Pessoa {

	public Aluno(String nome, String sexo, int idade) {
		super(nome, sexo, idade);		
	}

	@Override
	public String falar() {
		 return "[ "+getNome()+" ] Sou Um Aluno";
	}

	@Override
	public void falar(String mensagem) {
		
		System.out.println("[ "+getNome()+" ] "+mensagem);
		
	}

}
