package Exemplo;

import javax.swing.JFrame;

/**
 * @author Abimael Santos 
 * Classe generica (pai) 
 * Serve como uma generalização do Jframe
 * A classe ja tem as definições basicas pre-definidas da tela
 * Todos as "telas"(jframes) iram herda dele ao inves de herdar do proprio jframe 
 */
public abstract class TelaGeral extends JFrame{

	/**
	 * Constante referente a largura da tela
	 */
	public static final int LARGURA = 500;
	/**
	 * Constante referente a altura da tela
	 */
	public static final int ALTURA = 500;
	
	/**
	 * Construtor default
	 * Define todas as defini��es default da tela 
	 */
	public TelaGeral() {
		
		super("Exemplo Jogo");//titulo da tela
		
		setSize(LARGURA, ALTURA);//tamanho da tela (Largura x Altura)
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//A��o quando fecha a tela
		
		setResizable(false);//define se a tela pode ser redimencionada 
		
		setUndecorated(true);// define se a tela tera bordas - tira as bordas da tela 
		
		setLocationRelativeTo(null);//define a localiza��o da tela - "null" significa que ela sera mostrada no centro
		
		setVisible(false);//define se a tela � visivel
		
	}
	
}
