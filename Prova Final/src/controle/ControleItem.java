package controle;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import view.TelaCadastroCatalogo;

public class ControleItem implements ItemListener{

	private TelaCadastroCatalogo cadastroCatalogo;

	public ControleItem(TelaCadastroCatalogo cadastroCatalogo) {
		super();
		this.cadastroCatalogo = cadastroCatalogo;
		
		control();
	}

	private void control() {

		cadastroCatalogo.getCbxTipo().addItemListener(this);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if(cadastroCatalogo.getCbxTipo().getSelectedItem().equals("Dvd"))
		{
			
			cadastroCatalogo.getLblGenero().setVisible(true);
			cadastroCatalogo.getTfdGenero().setVisible(true);
			cadastroCatalogo.getLblNumero().setVisible(true);
			cadastroCatalogo.getTfdNumero().setVisible(true);
			
			cadastroCatalogo.getLblEditora().setVisible(false);
			cadastroCatalogo.getTfdEditora().setVisible(false);
			cadastroCatalogo.getLblVolume().setVisible(false);
			cadastroCatalogo.getTfdVolume().setVisible(false);
			cadastroCatalogo.getLblAno().setVisible(false);
			cadastroCatalogo.getTfdAno().setVisible(false);
			
		}
		else if(cadastroCatalogo.getCbxTipo().getSelectedItem().equals("Livro"))
		{
			cadastroCatalogo.getLblEditora().setVisible(true);
			cadastroCatalogo.getTfdEditora().setVisible(true);
			cadastroCatalogo.getLblVolume().setVisible(true);
			cadastroCatalogo.getTfdVolume().setVisible(true);
			cadastroCatalogo.getLblAno().setVisible(true);
			cadastroCatalogo.getTfdAno().setVisible(true);
			
			cadastroCatalogo.getLblGenero().setVisible(false);
			cadastroCatalogo.getTfdGenero().setVisible(false);
			cadastroCatalogo.getLblNumero().setVisible(false);
			cadastroCatalogo.getTfdNumero().setVisible(false);
		}
		
	}

}
