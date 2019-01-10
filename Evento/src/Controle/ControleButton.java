package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

import javax.swing.JOptionPane;

import View.Tela;

public class ControleButton implements ActionListener {

	private Tela tela;

	public ControleButton(Tela tela) {
		super();
		this.tela = tela;
		control();
	}

	public void control() {
		
		tela.getBtnOk().addActionListener(this);
		tela.getBtnCancelar().addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == tela.getBtnOk())
		{
			JOptionPane.showMessageDialog(null, "Sem Tratamento de Login", "...", JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource() == tela.getBtnCancelar())
		{
			System.exit(0);
		}
		
	}
	
}
