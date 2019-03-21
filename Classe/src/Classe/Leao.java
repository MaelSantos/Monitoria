package Classe;

public class Leao extends Animal implements Felino{

	private String raca;
	
	public Leao(String raca) {
		super(raca);
		
		this.raca = raca; //atributo da classe filha
		super.raca = raca;//atributo da classe pai
	}

	//sobrescreve um metodo da classe pai ou da interface
	//sobrescreita de metodo - tem que ter mesmo retorno e nome, a visibilidade só pode ser aumentada
	@Override
	public String falar() {
		return "Miauuuuuu";
	}
	
	/*
	 * sobrecarca de metodos - o mesmo metodo mas com parametros e comportamentos diferentes, 
	 * podendo ter visibilidade e retorno diferetes ou não
	 */
	public String rugir()
	{
		return "grrr";
	}
	
	public String rugir(double peso)
	{
		if(peso > 5 && peso < 10)
			return "grrrrr";
		else if(peso > 10)
			return "grrrrrrrrrrrrrrrrrr";
		else 
			return "grr";
	}
	
	public void rugir(String rugido)
	{
		System.out.println(rugido);
	}
	
	//metodo sobrescrevido
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
}
