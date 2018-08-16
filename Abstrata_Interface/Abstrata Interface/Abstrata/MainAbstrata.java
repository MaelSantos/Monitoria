package Abstrata;

/**
 * @author Abimael
 * Classe responsavel por criar os objetos e testalos
 */
public class MainAbstrata {

	public static void main(String[] args) {
		
		/*
		 * Declaração de objetos
		 * Tipo nome = new Tipo();
		 */
		Pessoa aluno = new Aluno("Mael", "M", 19);
		Pessoa professor = new Professor("Richarlyson", "M", 45);
		
		/*
		 * Chamada de metodos
		 *  objeto.metodo();
		 */
		System.out.println(aluno.falar());
		System.out.println(professor.falar());
		
	}
	
}
