package view;

import javax.swing.JPanel;

public abstract class PanelGenerico extends JPanel {

	public PanelGenerico() {
		
		setSize(Tela.LARGURA, Tela.ALTURA);
		
		setLayout(null);
		
		setVisible(false);
		
	}
	
}
