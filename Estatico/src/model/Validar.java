package model;

public class Validar {

	/*
	 * Atributo normal, pertencente ao objeto instanciado
	 * Dentro da classe é possivel ter acesso aos atributos estaticos
	 */
	private int numeroMaximo = 14;
	/*
	 * Atributo estatico pertencente a Classe
	 */
	private static int numeroMaximo2 = 14;
	
	/*
	 * Metodo normal pertencente ao objeto, a instancia da classe
	 */
	public boolean validarPessoa(Pessoa pessoa)
	{
		if(pessoa.getCpf() == null)
			return false;
		if(pessoa.getNome() == null)
			return false;
		if(pessoa.getCpf().length() != numeroMaximo)
			return false;
		
		return true;
	}
	
	/*
	 * Metodo estatico, pertecendo a Classe Validar e não ao objeto
	 */
	public static boolean validarPessoa2(Pessoa pessoa)
	{
		if(pessoa.getCpf() == null)
			return false;
		if(pessoa.getNome() == null)
			return false;
		/*
		 * metodos abstratos não tem acesso aos atribusto que não são estaticos
		 */
		if(pessoa.getCpf().length() != numeroMaximo2)
			return false;
		
		return true;
	}	
}
