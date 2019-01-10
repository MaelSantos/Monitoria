package Controle;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import View.Tela;

public class ControleKey implements KeyListener{

	private Tela tela;
	
	public ControleKey(Tela tela) {
		super();
		this.tela = tela;
		control();
	}

	private void control() {

		tela.addKeyListener(this);
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int codigo = e.getKeyCode();
		
		switch (codigo) {
		case KeyEvent.VK_ENTER:
			System.out.println("Enter");
		case KeyEvent.VK_SPACE:
			System.out.println("Espaço");
			break;

		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Stub de método gerado automaticamente
		
	}

	
	public class Adapter extends KeyAdapter{
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Stub de método gerado automaticamente
			super.keyPressed(e);
		}
		
	}
	
}
