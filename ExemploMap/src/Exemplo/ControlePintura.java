package Exemplo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Map;

public class ControlePintura extends Jogo {

	private Map<Bloco, String> blocos;
	
	public ControlePintura(Fase fase, Map<Bloco, String> blocos) {

		super(fase);

		this.blocos = blocos;

		start();
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.WHITE);
		g.fillRect(0, 0, fase.getWidth(), fase.getHeight());

		for (Bloco bloco : blocos.keySet()) {
			bloco.draw(g);			
		}

	}

}
