package view;

import javax.swing.JButton;

public class Ajuda extends PanelGeral{

	private static final long serialVersionUID = -8140807677562760651L;
	
	private JButton btnVoltar;
	
	public Ajuda() {
		super("Ajuda");
		
		btnVoltar = new JButton("Voltar");
		
		add(btnVoltar);
	}
	
	public JButton getBtnVoltar() {
		return btnVoltar;
	}
	
}
