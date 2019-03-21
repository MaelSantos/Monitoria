package Classe;

/*
 * quando uma classe é abstrata ela não pode ser inicializada
 * serve somente como base para as classes filhas
 */
public abstract class Animal {

	protected String raca;

	//as classes filhas são obrigadas a informar os atribustos do construtor da classe pai
	public Animal(String raca) {
		super();
		this.raca = raca;
	}

	//metodo abstrato - as classes filhas são obrigadas a implementar os metodos abstratos
	public abstract void comer();
	
	//metodos getters e setters - servem para acessar e alterar os atributos do objeto
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	//desaloca o espaço de memoria do objeto
	public static void destrutor(Object obj)
	{
		obj = null;
		System.gc(); // limpa a memoria 
	}
	
}
