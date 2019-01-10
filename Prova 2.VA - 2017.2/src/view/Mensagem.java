package view;

import javax.swing.JOptionPane;

public class Mensagem {

	public static void exibirMensagem(String mensagem)
	{
		JOptionPane.showMessageDialog(null, mensagem, "Mensagem",JOptionPane.YES_OPTION);
	}
	
}
