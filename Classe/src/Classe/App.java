package Classe;

public class App {

	public boolean t;
	
	public static void main(String[] args) {

		Gato gato = new Gato("Siam�s", "Amaterasu", 1, 2);
		Gato gato2 = new Gato("Vira-Lata");
		
		System.out.println(gato.falar());//metodo sobrescrito na classe Gato
		
		System.out.println(gato.falarDefault());//metodo default da interface Felino
		
		System.out.println(gato);// se o toString n�o for sobrescrevido vai retornar o endere�o de memoria
		
		Leao leao = new Leao("");
		
		leao.rugir("grrr");
		
		System.out.println(leao.rugir(20));
		
		System.out.println(leao.rugir());
		
		System.out.println(gato.getNome());
		
		Animal.destrutor(gato);
		Animal.destrutor(gato2);
		Animal.destrutor(leao);
	}
	
}
