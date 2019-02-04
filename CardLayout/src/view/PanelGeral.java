package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class PanelGeral extends JPanel {

	private static final long serialVersionUID = -3903068060075124839L;

	protected String nome;
	
	public PanelGeral(String nome) {
		
		this.nome = nome;
		
		setLayout(new FlowLayout());
		setSize(500, 500);
		setVisible(false);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.drawString(nome, getWidth()/2, getHeight()/2);
	}
	
}
