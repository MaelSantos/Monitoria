package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Tela extends JFrame {

	private JButton btnAdd, btnSair;
	private JTextField tfdNome, tfdCpf, tfdIdade;
	private JLabel lblNome, lblCpf, lblIdade;
	
	public Tela() {
		super("Padrão DAO");
		
		init();
		
		setSize(500,500);
		
		setLayout(new GridLayout(6, 2));
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setUndecorated(true);
		
		setVisible(true);
	}
	
	public void init()
	{
		btnAdd = new JButton("Adicionar Pessoa"); 
		btnSair = new JButton("Sair");
		
		tfdNome = new JTextField(10);
		tfdCpf = new JTextField(10);
		tfdIdade = new JTextField(10);
		
		lblNome = new JLabel("Nome");
		lblCpf = new JLabel("CPF");
		lblIdade = new JLabel("Idade");
		
		add(lblNome);
		add(tfdNome);
		
		add(lblCpf);
		add(tfdCpf);
		
		add(lblIdade);
		add(tfdIdade);
		
		add(btnAdd);
		add(btnSair);
	}

	//metodos getters e setters
	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

	public JTextField getTfdNome() {
		return tfdNome;
	}

	public JTextField getTfdCpf() {
		return tfdCpf;
	}

	public JTextField getTfdIdade() {
		return tfdIdade;
	}
	
}
