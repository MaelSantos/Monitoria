package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class Inventario extends PanelGeral{

	private static final long serialVersionUID = -6253081079185465679L;
	
	private JButton btnVoltar;
	
	public Inventario() {
		super("Invetario");

		btnVoltar = new JButton("Voltar");
		
		add(btnVoltar);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.WHITE);
		g.drawString(nome, getWidth()/2, getHeight()/2);
	}
	
	public JButton getBtnVoltar() {
		return btnVoltar;
	}
	
}
