package view;

import javax.swing.JButton;

public class TelaCadastro extends FrameGenerico {

	private JButton btnCadastro, btnSair, btnSalvar;
	
	public TelaCadastro() {

		setSize(200, 200);
		
		btnCadastro = new JButton("Cadastro");
		
		btnSair = new JButton("Sair");
		
		btnSalvar = new JButton("Salvar");
		
		add(btnCadastro);
		add(btnSalvar);
		add(btnSair);
		
	}

	public JButton getBtnCadastro() {
		return btnCadastro;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}
	
}
