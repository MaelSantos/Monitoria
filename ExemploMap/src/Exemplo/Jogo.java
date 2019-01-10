package Exemplo;

import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class Jogo implements Runnable {

	private boolean loop = false;
	private Thread thread;
	
	protected Fase fase;
	
	protected Graphics2D graficosTela;
	
	public Jogo(Fase fase) {
		this.fase = fase;
	}
	
	public void run() {
				
		fase.requestFocus();
		graficosTela = fase.getGraficosTela();
		
		
		while(true){
			
			try {
				
				if(loop)
				{
					draw(graficosTela);
				}
				gameDraw();
				
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public abstract void draw(Graphics g);

	private void gameDraw() {
		
		fase.repaint();
	}
	
	public void start()
	{
		if(thread == null)
		{
			thread = new Thread(this);
			thread.start();			
		}
		loop = true;
	}
	
	public void stop()
	{
		loop = false;
	}

}
