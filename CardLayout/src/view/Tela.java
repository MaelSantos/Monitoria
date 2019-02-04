package view;

import java.awt.CardLayout;

import javax.swing.JFrame;

public class Tela extends JFrame {

	private static final long serialVersionUID = -4212730098499507887L;
	
	private CardLayout cardLayout;
	private Menu menu;
	private Fase fase;
	private Credito credito;
	private Ajuda ajuda;
	
	public Tela() {
		
		cardLayout = new CardLayout();
		
		setSize(500,500);
		setTitle("Exemplo CardLayout");
		setLayout(cardLayout);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menu = new Menu();
		fase = new Fase();
		ajuda = new Ajuda();
		credito = new Credito();
		
		add(menu, "m");
		add(fase, "f");
		add(ajuda, "a");
		add(credito, "c");
		
		cardLayout.show(getContentPane(), "m");
		
		setVisible(true);
		
	}

	public void show(String indice)
	{
		cardLayout.show(getContentPane(), indice);
	}
	
	public Menu getMenu() {
		return menu;
	}

	public CardLayout getCardLayout() {
		return cardLayout;
	}

	public Fase getFase() {
		return fase;
	}

	public Credito getCredito() {
		return credito;
	}

	public Ajuda getAjuda() {
		return ajuda;
	}
	
}
