package runnable;

import javax.swing.JPanel;

public class App extends JPanel implements Runnable{

	private Thread thread;
	
	@Override
	public void addNotify() {
		super.addNotify();
		if(thread == null)
		{
			thread = new Thread(this);
			thread.start();
		}		
	}
	
	@Override
	public void run() {
		
		while(true)
		{
			System.out.println("Funcionando");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Bloco catch gerado automaticamente
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		new App();
	}
	
}
