package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Ajuda;
import view.Credito;
import view.Inventario;
import view.Menu;
import view.Tela;

public class ControleAcao implements ActionListener{

	private Tela tela;
	private Menu menu;
	private Inventario inventario;
	private Ajuda ajuda;
	private Credito credito;
	
	public ControleAcao(Tela tela) {
		super();
		this.tela = tela;
		menu = tela.getMenu();
		inventario = tela.getFase().getInventario();
		ajuda = tela.getAjuda();
		credito = tela.getCredito();
		
		control();
	}

	private void control() {
		
		menu.getBtnAjuda().addActionListener(this);
		menu.getBtnCreditos().addActionListener(this);
		menu.getBtnIniciar().addActionListener(this);
		
		inventario.getBtnVoltar().addActionListener(this);
		ajuda.getBtnVoltar().addActionListener(this);
		credito.getBtnVoltar().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == inventario.getBtnVoltar())
			tela.show("m");
		else if(obj == credito.getBtnVoltar())
			tela.show("m");
		else if(obj == ajuda.getBtnVoltar())
			tela.show("m");
		else if(obj == menu.getBtnAjuda())
			tela.show("a");
		else if(obj == menu.getBtnCreditos())
			tela.show("c");
		else if(obj == menu.getBtnIniciar())
			tela.show("f");
		
	}

}
