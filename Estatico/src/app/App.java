package app;

import model.Pessoa;
import model.Validar;

public class App {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Mael", "000.000.000-00");
		
		Validar validar = new Validar();
		
		/*
		 * Chamada de metodo estatico
		 * metodos estaticos são acessados diretamente da classe, sem precisar de instancia
		 */
		System.out.println(Validar.validarPessoa2(pessoa));
		/*
		 * Metodos normais precisam de uma instancia da classe para serem acessados
		 * os metodos pertencem ao objeto
		 */
		System.out.println(validar.validarPessoa(pessoa));
		/*
		 * a IDE coloca uma mensagem de alerta 
		 * por que o metodo estatico não pertence ao objeto e sim a classe
		 * mesmo sendo possivel acessar assim, não é correto
		 */
		System.out.println(validar.validarPessoa2(pessoa));
		/*
		 * A classe so tem acesso aos atributos e metodos estaticos
		 * a IDE manda uma mensagem de erro ao tentar acessar um metodo normal
		 */
//		System.out.println(Validar.validarPessoa(pessoa));
	}
	
}
