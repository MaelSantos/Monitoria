package Controle;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import View.Tela;

public class ControleMouse implements MouseListener{

	private Tela tela;
	
	public ControleMouse(Tela tela) {
		super();
		this.tela = tela;
		control();
	}

	private void control() {
		
		tela.getLblLogin().addMouseListener(this);
		tela.getLblsenha().addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Cliques: "+e.getClickCount());
		if(e.getSource() == tela.getLblLogin())
		{
			System.out.println("Login");
		}
		if(e.getSource() == tela.getLblsenha())
		{
			System.out.println("Senha");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entrou");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		System.out.println("Saiu");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		System.out.println("Precionado");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		System.out.println("Soltado");
		
	}

	
	public class Adapter extends MouseAdapter
	{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Stub de método gerado automaticamente
			super.mouseClicked(e);
		}
		
	}
	
}
