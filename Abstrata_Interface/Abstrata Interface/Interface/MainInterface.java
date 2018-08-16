package Interface;

/**
 * @author Abimael
 * Classe responsavel por criar os objetos e testalos
 */
public class MainInterface {

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
		
		/*
		 * chamada de metodos default da interface
		 */
		aluno.falarDefault();
		professor.falarDefault();
		
		/*
		 * chamada de metodos sobrescrito/implementado da interface
		 */
		aluno.falar("Nada a declarar");
		professor.falar("Nada a declarar");
		
	}
	
}
