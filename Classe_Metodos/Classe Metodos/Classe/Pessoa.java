package Classe;

public class Pessoa {

	//campos atributos
	private String nome;
	private int idade;
	
	//contrutor default
	public Pessoa() {
		
	}
	//contrutor com os campos 
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//destrutor 
	public static void destrutor(Object obj)
	{
		obj = null;
		System.gc();
	}
	
	//metodo
	public void falar()
	{
		System.out.println("Meu Nome é "+nome+", Tenho "+idade+" Anos");
	}
	
	public void falar(String fala)
	{
		System.out.println(fala);
	}
	
	//metodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
}
