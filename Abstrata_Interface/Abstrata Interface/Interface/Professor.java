package Interface;

public class Professor extends Pessoa {

	public Professor(String nome, String sexo, int idade) {
		super(nome, sexo, idade);		
	}
	
	@Override
	public String falar() {
		return "[ "+getNome()+" ] Sou Um Professor";
	}

	@Override
	public void falar(String mensagem) {
		System.out.println("[ "+getNome()+" ] "+mensagem);
	}

}
