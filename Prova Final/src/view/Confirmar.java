package view;

import javax.swing.JOptionPane;

public class Confirmar {

	public static void mensagem(String mensagem)
	{
		JOptionPane.showMessageDialog(null, mensagem, "Mensagem", JOptionPane.ERROR_MESSAGE);
	}
	
	public static boolean confirmar(String mensagem)
	{
		int confirmar = JOptionPane.showConfirmDialog(null, mensagem, "Confirmar", JOptionPane.YES_NO_OPTION);
		
		if(confirmar == JOptionPane.YES_OPTION)
			return true;
		else
			return false;
	}
	
}
