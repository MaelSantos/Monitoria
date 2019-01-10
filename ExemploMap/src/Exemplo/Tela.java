package Exemplo;

/**
 * @author Abimael Santos
 * Tela principal da aplicação
 * Ela é resposanvel por contar os Panels
 */
public class Tela extends TelaGeral { //toda tela(jframe) se extendera de TelaGeral

	//Panels
	private Fase fase;
	
	/**
	 * Iniciliaza os componentes e adiciona na tela 
	 */
	public Tela() {
		
		fase = new Fase();
		
		add(fase);
		
		setVisible(true);
	}

	/**
	 * @return fase
	 */
	public Fase getFase() {
		return fase;
	}
	
}
