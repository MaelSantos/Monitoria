package Interface;

/**
 * @author Abimael
 * Classe abstrata que implementa a interface Acao,
 * classes abstratas não são obrigadas a sobrescrever/implementar os metodos da interface,
 * se eles não implementarem suas classes filhas são obrigadas a implementar,
 * se eles implementarem suas classes filhas não são obrigadas a implementar.
 * 
 *	A classe abstrata server como uma generalização, ou seja as outras classes vão herda dela,
 *	Todas as entidades em comum se extendem dessa classe.
 */
public abstract class Pessoa implements Acao{

	/* atributos - sempre no inicio
	 * Declaração de atributos: Encapsulamento Tipo nome;
	 * Encapsulamento : public, private, protected.
	 * Tipo: int, String, double, float.
	 * nome: sempre iniciado por uma letra minuscula, não aceita caracteres especiais no inicio nem os reservados do java(<>=-+/#%...).
	 */
	private String nome;
	private String sexo;
	private int idade;
	
	//contrutor - logo depois dos atributos
	/**
	 * @param nome
	 * @param sexo
	 * @param idade
	 * 
	 * Contrutor precisa receber esses atributos por paramentro,
	 * ou seja estou forçando todos os filhos(Classes que vão herda de Pessoa) utilizarem esse contrutor
	 */ 
	public Pessoa(String nome, String sexo, int idade) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	/*	metodos getters e setters - sempre por ultimo
	 *  Esses metodos servem para acessar as suas variaveis 
	 */
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
