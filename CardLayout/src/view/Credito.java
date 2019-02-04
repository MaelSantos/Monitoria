package view;

import javax.swing.JButton;

public class Credito extends PanelGeral {
	
	private static final long serialVersionUID = 9038375874185268776L;
	
	private JButton btnVoltar;

	public Credito() {
		super("Credito");

		btnVoltar = new JButton("Voltar");

		add(btnVoltar);

	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

}
