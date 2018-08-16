package Generalização;

public class MainGeneralizacao {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente("Rico", 10000);
		Funcionario desenvolvedor = new Desenvolvedor("Mael", 5000);
		
		System.out.println("Eu sou um "+gerente.cargo());
		System.out.println("Eu sou um "+desenvolvedor.cargo());
		
		if (gerente instanceof Gerente) {
			System.out.println("Eu sou um "+gerente.cargo());	
		}
		if (desenvolvedor instanceof Desenvolvedor) {
			System.out.println("Eu sou um "+desenvolvedor.cargo());	
		}
		if (gerente instanceof Funcionario) {
			System.out.println("Eu sou um "+gerente.cargo()+" E um funcionario");	
		}
		if (desenvolvedor instanceof Funcionario) {
			System.out.println("Eu sou um "+desenvolvedor.cargo()+" E um funcionario");	
		}
		
	}
	
}
