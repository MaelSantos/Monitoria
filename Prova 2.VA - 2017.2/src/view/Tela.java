package view;

import javax.swing.JFrame;

public abstract class Tela extends JFrame {

	public static final int LARGURA = 500;
	public static final int ALTURA = 500;
	
	public Tela() {
		
		super("Prova 2 V.A - 2017.2");//titulo
		
		setSize(LARGURA, ALTURA);//o tamanho da tela 
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);// a ação ao fechar a tela
		
		setLocationRelativeTo(null);//localização da tela
		
		setVisible(false);//visibilidade
		
	}
	
}
