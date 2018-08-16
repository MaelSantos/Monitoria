package Abstrata;

/**
 * 
 * @author Abimael Santos
 *	Classe abstrata,  
 *	Server como uma generaliza��o, ou seja as outras classes v�o herda dela,
 *	Todas as entidades em comum se extendem dessa classe.
 */
public abstract class Pessoa {

	/* atributos - sempre no inicio
	 * Declara��o de atributos: Encapsulamento Tipo nome;
	 * Encapsulamento : public, private, protected.
	 * Tipo: int, String, double, float.
	 * nome: sempre iniciado por uma letra minuscula, n�o aceita caracteres especiais no inicio nem os reservados do java(<>=-+/#%...);
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
	 * ou seja estou for�ando todos os filhos(Classes que v�o herda de Pessoa) utilizarem esse contrutor
	 */
	public Pessoa(String nome, String sexo, int idade) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	//metodo abstract - metodos depois dos construtores.
	/**
	 * @return String
	 * Metodo abtrato que � obrigatoriamente sobrescrito pelas classes filhas, 
	 * a n�o ser que essas classes filhas sejam abstratas tambem
	 * 
	 * Ele tem que ser sobrescrito em todos as classes filhas,
	 *  pois cada uma delas vai fazer esse metodo diferente, o funcionamento � diferente
	 */
	public abstract String falar();

	
	/*	metodos getters e setters - sempre por ultimo,
	 *  Esses metodos servem para acessar as suas variaveis. 
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
