package Classe;

public class Gato extends Animal implements Felino{

	//atributos - caracteristicas do objeto
	private String nome;
	private int peso;
	private int idade;
	
	//define o que é preciso para o objeto existir - aloca melhora para o objeto existir
	public Gato(String raca, String nome, int peso, int idade) {
		super(raca);//se refere a classe pai - toda classe herda de Object
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
	}
	
	//sobrecarga de construtor
	public Gato(String raca) {
		super(raca);//se refere a classe pai - toda classe herda de Object
		
		/*
		 * como os outros atributos não foram inicializados eles ficam com seu default
		 * 
		 *  int - 0
		 *  String - null
		 *  double - 0.0
		 *  boolean - false
		 */
	}
	
	//metodos são os comportamentos do objeto
	public String ronronar()
	{
		return "zzzzzzzzz";
	}
	
	//sobrescreve um metodo da classe pai ou da interface
	//sobrescreita de metodo - tem que ter mesmo retorno e nome, a visibilidade só pode ser aumentada
	@Override
	public String falar()
	{
		return "Miau";
	}
	
	//metodo sobrescrevido
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	//metodos getters e setters - servem para acessar e alterar os atributos do objeto
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Gato [nome = " + nome + ", peso = " + peso + ", idade = " + idade + "]";
	}
	
}
