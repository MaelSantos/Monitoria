package Exemplo;

import javax.swing.JPanel;

/**
 * 
 * @author Abimael Santos
 * Classe generica (pai) 
 * Serve como uma generaliza��o do JPanel
 * A classe ja tem as defini��es basicas pre-definidas dos panels
 * Todos as panels iram herda dele ao inves de herdar do proprio jpanel
 */
public abstract class PanelGeral extends JPanel {
	
	/**
	 * Define as propriedades padr�es da tela
	 */
	public PanelGeral() {
						
		setSize(TelaGeral.LARGURA, TelaGeral.ALTURA);// define o tamanho do panel(Largura x Altura) - Utiliza o mesmo da TelaGeral
		
		setLayout(null);//define o layout - null siginifica que � preciso definir o local exato de todos os componentes 
		
		setVisible(false);//define se a tela sera visivel
		
	}	
}
