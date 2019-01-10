package consumidor_produtor;

public class Dado {
	Integer buffer;
	boolean cheio = false ;

	public synchronized Integer getBuffer() {
		if(!cheio) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		cheio = false;
		notifyAll();
		return buffer;
	}

	public synchronized void setBuffer(Integer buffer) {
		if(cheio) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.buffer = buffer;
		cheio = true;
		notifyAll();
		
	}
}
