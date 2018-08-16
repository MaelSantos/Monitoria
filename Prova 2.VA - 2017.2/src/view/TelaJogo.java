package view;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TelaJogo extends Tela {

	private JogoPanel jogoPanel;
	
	public TelaJogo() {
		
		jogoPanel = new JogoPanel();
		
		add(jogoPanel);
		
	}

	public JogoPanel getJogoPanel() {
		return jogoPanel;
	}
	
	
	
}
