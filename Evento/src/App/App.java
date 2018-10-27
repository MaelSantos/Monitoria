package App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controle.ControleButton;
import Controle.ControleKey;
import Controle.ControleMouse;
import View.Tela;

public class App {

	public static void main(String[] args) {
		
		Tela tela = new Tela();
		new ControleButton(tela);
		new ControleMouse(tela);
		new ControleKey(tela);
		tela.requestFocus();
		
//		tela.getBtnCancelar().addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				System.out.println("Classe interna anonima");
//			}
//		});
	}

}
