package controle;

import java.awt.Graphics;

import model.Personagem;
import view.TelaJogo;

public class ControlePintura implements Runnable{

	private TelaJogo jogo;//view
	private Personagem personagem;//model
	
	public Graphics g;
	public Thread thread;
	
	public ControlePintura(TelaJogo jogo, Personagem personagem) {
		super();
		this.jogo = jogo;
		this.personagem = personagem;
		
		g = jogo.getJogoPanel().getGraphics();
		
		thread = new Thread(this);
		thread.start();
	}

	public void draw()
	{
		g.drawImage(personagem.getImage(), personagem.getX(), personagem.getY(), null);
	}

	@Override
	public void run() {
		
		while(true)
		{
			if(jogo.isVisible())
			{
				draw();
				
				try {
					Thread.sleep(40);
					
				} catch (InterruptedException e) {
					// TODO Bloco catch gerado automaticamente
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
	
}
