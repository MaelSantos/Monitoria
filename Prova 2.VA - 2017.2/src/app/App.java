package app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import controle.ControleJoystick;
import controle.ControlePintura;
import model.Backup;
import model.CampoPassoVazio;
import model.Personagem;
import view.Mensagem;
import view.TelaJogo;
import view.TelaJoystick;

public class App extends Thread{

	private static List<Personagem> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//models
//		List<Personagem> list = new ArrayList<>();
		list.add(new Personagem(200, 200, "mario.png"));
		list.add(new Personagem(200, 200, "luigi.png"));
		
		//view
		TelaJogo telaMario = new TelaJogo();
		telaMario.setVisible(true);
		TelaJogo telaLuigi = new TelaJogo();
		telaLuigi.setVisible(true);
		TelaJoystick joystick = new TelaJoystick();
		joystick.setVisible(true);
		
		//controls
		ControlePintura controleMario = new ControlePintura(telaMario, list.get(0));
		ControlePintura controleLuigi = new ControlePintura(telaLuigi, list.get(1));
		ControleJoystick controleJoystick = new ControleJoystick(joystick, telaMario, telaLuigi,
				list.get(0),list.get(1));
		
		try {
			controleJoystick.control();
		} catch (CampoPassoVazio e) {
			Mensagem.exibirMensagem(e.getMessage());
			e.printStackTrace();
		}
		
		new App().start();
		
	}
	
	@Override
	public void run() {
		while (true) {
			
			try {
				
				Thread.sleep(10000);
				Backup.salvarPosicao(list.get(0));
				
			} catch (InterruptedException | IOException e) {
				
				Mensagem.exibirMensagem("Erro ao salvar os dados do personagem!!!");
				
				e.printStackTrace();
			} 
			
		}
	}
	
}
