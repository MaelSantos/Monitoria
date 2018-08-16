package Padrão;

public class Perseguicao {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Policial policial = new Policial();
		Ladrao ladrao = new Ladrao();
		ladrao.addObserver(policial);
		
		ladrao.baixo();
		
		System.out.println(ladrao.toString());
		System.out.println(policial.toString());
		
		ladrao.cima();
		
		System.out.println("\n"+ladrao.toString());
		System.out.println(policial.toString());
		
		ladrao.direita();
		
		System.out.println("\n"+ladrao.toString());
		System.out.println(policial.toString());
		
		ladrao.esquerda();
		
		System.out.println("\n"+ladrao.toString());
		System.out.println(policial.toString());
		
	}
	
}
