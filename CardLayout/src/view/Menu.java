package view;



import javax.swing.JButton;

public class Menu extends PanelGeral{

	private static final long serialVersionUID = 4329803362595891988L;
	
	private JButton btnCreditos, btnAjuda, btnIniciar;
	
	public Menu() {
		
		super("Menu");
		
		btnAjuda = new JButton("Ajuda");
		btnCreditos = new JButton("Creditos");
		btnIniciar = new JButton("Iniciar");
		
		add(btnIniciar);
		add(btnAjuda);
		add(btnCreditos);
		
	}

	public JButton getBtnCreditos() {
		return btnCreditos;
	}

	public JButton getBtnAjuda() {
		return btnAjuda;
	}

	public JButton getBtnIniciar() {
		return btnIniciar;
	}
}
