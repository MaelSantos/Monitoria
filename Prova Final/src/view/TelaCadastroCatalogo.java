package view;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroCatalogo extends FrameGenerico{

	private JComboBox<String> cbxTipo;
	private JLabel lblCodigo, lblNome, lblAutor, lblEditora, lblVolume, lblAno;
	private JLabel lblGenero, lblNumero;
	
	private JTextField tfdCodigo, tfdNome, tfdAutor, tfdEditora, tfdVolume, tfdAno;
	private JTextField tfdGenero, tfdNumero; 
	
	private JButton btnExibir, btnAdd, btnVoltar;
	
	private JPanel pnlButton;
	
	public TelaCadastroCatalogo() {
		
		cbxTipo = new JComboBox<>(new String[] {"Livro","Dvd"});
		
		lblCodigo = new JLabel("Codigo");
		lblNome = new JLabel("Nome");
		lblAutor = new JLabel("Autor");
		lblEditora = new JLabel("Editora");
		lblVolume = new JLabel("Volume");
		lblAno = new JLabel("Ano");
		
		lblGenero = new JLabel("Genero");
		lblNumero = new JLabel("Numero");
		
		tfdCodigo = new JTextField(10);
		tfdNome = new JTextField(10);
		tfdAutor = new JTextField(10);
		tfdEditora = new JTextField(10);
		tfdVolume = new JTextField(10);
		tfdAno  = new JTextField(10);
		
		tfdGenero = new JTextField(10);
		tfdNumero = new JTextField(10); 
		
		btnExibir = new JButton("Exibir");
		btnAdd = new JButton("Add");
		btnVoltar = new JButton("Voltar");
		
		pnlButton = new JPanel();
		pnlButton.setLayout(new FlowLayout());
		
		add(cbxTipo);
		
		add(lblCodigo);
		add(tfdCodigo);
		
		add(lblNome);
		add(tfdNome);
		
		add(lblAutor);
		add(tfdAutor);
		
		add(lblEditora);
		add(tfdEditora);
		
		add(lblVolume);
		add(tfdVolume);
		
		add(lblAno);
		add(tfdAno);
		
		add(lblGenero).setVisible(false);
		add(tfdGenero).setVisible(false);
		
		add(lblNumero).setVisible(false);
		add(tfdNumero).setVisible(false);
		
		pnlButton.add(btnExibir);
		pnlButton.add(btnAdd);
		pnlButton.add(btnVoltar);
		
		add(pnlButton);
	}

	public String recuperarDados()
	{
		String re = "";
		
		for(Component a : getContentPane().getComponents())
			if (a instanceof JTextField) {
				JTextField f = (JTextField) a;
				re += f.getText().trim()+"\n";
			}
		
		return re;
	}
	
	public JComboBox<String> getCbxTipo() {
		return cbxTipo;
	}

	public JLabel getLblEditora() {
		return lblEditora;
	}

	public JLabel getLblVolume() {
		return lblVolume;
	}

	public JLabel getLblAno() {
		return lblAno;
	}

	public JLabel getLblGenero() {
		return lblGenero;
	}

	public JLabel getLblNumero() {
		return lblNumero;
	}

	public JTextField getTfdEditora() {
		return tfdEditora;
	}

	public JTextField getTfdVolume() {
		return tfdVolume;
	}

	public JTextField getTfdAno() {
		return tfdAno;
	}

	public JTextField getTfdGenero() {
		return tfdGenero;
	}

	public JTextField getTfdNumero() {
		return tfdNumero;
	}

	public JButton getBtnExibir() {
		return btnExibir;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public JPanel getPnlButton() {
		return pnlButton;
	}

	public JLabel getLblCodigo() {
		return lblCodigo;
	}

	public JLabel getLblNome() {
		return lblNome;
	}

	public JLabel getLblAutor() {
		return lblAutor;
	}

	public JTextField getTfdCodigo() {
		return tfdCodigo;
	}

	public JTextField getTfdNome() {
		return tfdNome;
	}

	public JTextField getTfdAutor() {
		return tfdAutor;
	}

}
