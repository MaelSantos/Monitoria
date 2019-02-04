package app;

import controle.ControleAcao;
import view.Tela;

public class App {

	public static void main(String[] args) {
		
		Tela tela = new Tela();
		new ControleAcao(tela);
	}
	
}
