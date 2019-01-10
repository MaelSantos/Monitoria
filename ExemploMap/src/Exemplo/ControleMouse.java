package Exemplo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;

public class ControleMouse extends MouseAdapter {

	private Map<Bloco, String> blocos;
	private Fase fase;
	String[] questao = {
			"Azul","Verde", "Vermelho"
		};
	private int index, atual;

	public ControleMouse(Fase fase, Map<Bloco, String> blocos) {
		super();
		this.blocos = blocos;
		this.fase = fase;
		
		index = 0;
		fase.setQuestao("Click na cor "+questao[index]);
		fase.repaint();
		atual = index;
		index++;
		
		control();
	}

	private void control() {
		for (Bloco bloco : blocos.keySet()) {
			bloco.addMouseListener(this);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		for (Bloco bloco : blocos.keySet()) {

			if (e.getSource() == bloco)
			{
				System.out.println(blocos.get(bloco));
				
				if(blocos.get(bloco).equalsIgnoreCase(questao[atual]))
				{
					fase.setQuestao("Click na cor "+questao[index]);
					fase.repaint();
					atual = index;
					index++;
					if(index > 2)
						index = 0;					
				}
				
			}
		}

	}

}
