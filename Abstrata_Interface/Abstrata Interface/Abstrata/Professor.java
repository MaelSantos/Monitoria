package Abstrata;

/**
 * @author Abimael
 *	Classe filha que herda (extende) de Pessoa
 */
public class Professor extends Pessoa {

	/**
	 * @param nome
	 * @param sexo
	 * @param idade
	 * 
	 * Tem que usar obrigatoriamente o contrutor definido em Pessoa
	 * Pode-se criar outros contrutores mas ele é obrigado a passar esses atributos
	 */
	public Professor(String nome, String sexo, int idade) {
		super(nome, sexo, idade);		
	}
	
	@Override
	/**
	 * Metodo abstrato definido em Pessoa
	 */
	public String falar() {
		return "Sou Um Professor [ "+getNome()+" ]";
	}

}
