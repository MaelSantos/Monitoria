package Classe;

/*
 * quando uma classe � abstrata ela n�o pode ser inicializada
 * serve somente como base para as classes filhas
 */
public abstract class Animal {

	protected String raca;

	//as classes filhas s�o obrigadas a informar os atribustos do construtor da classe pai
	public Animal(String raca) {
		super();
		this.raca = raca;
	}

	//metodo abstrato - as classes filhas s�o obrigadas a implementar os metodos abstratos
	public abstract void comer();
	
	//metodos getters e setters - servem para acessar e alterar os atributos do objeto
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	//desaloca o espa�o de memoria do objeto
	public static void destrutor(Object obj)
	{
		obj = null;
		System.gc(); // limpa a memoria 
	}
	
}
