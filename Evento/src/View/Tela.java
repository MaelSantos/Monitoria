package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame{

	private JButton btnOk, btnCancelar;
	private JTextField tfdLogin, tfdSenha;
	private JLabel lblLogin, lblsenha;
	
	public Tela() {
		
		setTitle("Exemplo Evento");
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		btnOk = new JButton("Ok");
		btnCancelar = new JButton("Cancelar");
		tfdLogin = new JTextField(10);
		tfdSenha = new JTextField(10);
		lblLogin = new JLabel("Login");
		lblsenha = new JLabel("Senha");
		
		add(lblLogin);
		add(tfdLogin);
		add(lblsenha);
		add(tfdSenha);
		add(btnOk);
		add(btnCancelar);
		
		setVisible(true);
	}

	public JButton getBtnOk() {
		return btnOk;
	}

	public JTextField getTfdLogin() {
		return tfdLogin;
	}

	public JTextField getTfdSenha() {
		return tfdSenha;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public JLabel getLblLogin() {
		return lblLogin;
	}

	public JLabel getLblsenha() {
		return lblsenha;
	}
	
	
	
}
