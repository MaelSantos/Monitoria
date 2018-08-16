package Classe;

public class MainClasse {

	public static void main(String[] args) {
		
		Pessoa pessoa_1 = new Pessoa("Mael",19); //instancio um objeto
		Pessoa pessoa_2 = new Pessoa(); //instancio um objeto
		
		//chamada de metodo
		pessoa_2.falar();
		pessoa_1.falar();
	
//		//chamada dos setters 
//		pessoa_1.setNome("Maria");
//		pessoa_1.setIdade(20);
//		
//		//chamada getters
//		System.out.println("Nome : "+pessoa_1.getNome());
//		System.out.println("Idade: "+pessoa_1.getIdade());
		
	}
	
}
