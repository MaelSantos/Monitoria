package Exemplo;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		Tela tela = new Tela();

		Map<Bloco, String> blocos = new HashMap<>();

		blocos.put(new Bloco(Color.blue, 225, 100, 50, 50), "Azul");
		blocos.put(new Bloco(Color.green, 225, 200, 50, 50), "Verde");
		blocos.put(new Bloco(Color.red, 225, 300, 50, 50), "Vermelho");

		for (Bloco bloco : blocos.keySet()) {
			tela.getFase().add(bloco);			
		}
		
		new ControlePintura(tela.getFase(), blocos);
		new ControleMouse(tela.getFase(), blocos);
	}

}
