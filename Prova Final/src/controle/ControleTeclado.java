package controle;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;

import view.Confirmar;
import view.TelaCadastro;
import view.TelaCadastroCatalogo;

public class ControleTeclado extends KeyAdapter{

	private TelaCadastro cadastro;
	private TelaCadastroCatalogo cadastroCatalogo;

	public ControleTeclado(TelaCadastro cadastro, TelaCadastroCatalogo cadastroCatalogo) {
		super();
		this.cadastro = cadastro;
		this.cadastroCatalogo = cadastroCatalogo;

		control();
	}

	private void control() {
	
		cadastro.addKeyListener(this);
		cadastroCatalogo.addKeyListener(this);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int codigo = e.getKeyCode();
		
		switch (codigo) {
		case KeyEvent.VK_ESCAPE:
			if (Confirmar.confirmar("Deseja Realmente Sair?"))
				System.exit(0);
			break;

		default:
			break;
		}
		
	}
	
}
