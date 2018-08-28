package app;

import java.io.IOException;

import controle.ControleButton;
import controle.ControleItem;
import controle.ControleTeclado;
import model.Backup;
import model.BackupException;
import view.Confirmar;
import view.TelaCadastro;
import view.TelaCadastroCatalogo;
import view.TelaExibir;

public class App extends Thread{

	public static void main(String[] args) {
		TelaCadastro telaCadastro = new TelaCadastro();
		telaCadastro.setVisible(true);
		
		TelaCadastroCatalogo cadastroCatalogo = new TelaCadastroCatalogo();
		
		TelaExibir exibir = new TelaExibir();
		
		new ControleButton(telaCadastro, cadastroCatalogo, exibir);
		new ControleTeclado(telaCadastro, cadastroCatalogo);
		new ControleItem(cadastroCatalogo);
		new App().start();
	}
	
	@Override
	public void run() {
		
		while (true) {
			
			try {
				Thread.sleep(10000);
				Backup.backup();
			} catch (BackupException | InterruptedException | IOException e) {
				Confirmar.mensagem("Erro ao fazer o backup");
				e.printStackTrace();
			}
			
		}
		
	}
	
}
