package Interface;

/**
 * @author Abimael
 *	Classe filha que herda (extende) de Pessoa,
 * e � obrigada a implementar os metodos da interface,
 * a n�o ser que sua classe pai as implemente
 */
public class Professor extends Pessoa {

	/**
	 * @param nome
	 * @param sexo
	 * @param idade
	 * 
	 * Tem que usar obrigatoriamente o contrutor definido em Pessoa
	 * Pode-se criar outros contrutores mas ele � obrigado a passar esses atributos
	 */
	public Professor(String nome, String sexo, int idade) {
		super(nome, sexo, idade);		
	}
	
	/**
	 * Metodo sobrescrito da interface Acao
	 */
	@Override
	public String falar() {
		return "[ "+getNome()+" ] Sou Um Professor";
	}

	/**
	 * Metodo sobrescrito da interface Acao
	 */
	@Override
	public void falar(String mensagem) {
		System.out.println("[ "+getNome()+" ] "+mensagem);
	}

}
