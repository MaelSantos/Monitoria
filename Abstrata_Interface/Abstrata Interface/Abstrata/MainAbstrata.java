package Abstrata;

public class MainAbstrata {

	public static void main(String[] args) {
		
		Pessoa aluno = new Aluno("Mael", "M", 19);
		
		Pessoa professor = new Professor("Richarlyson", "M", 45);
		
		System.out.println(aluno.falar());
		System.out.println(professor.falar());
		
	}
	
}
