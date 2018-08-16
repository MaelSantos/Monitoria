package Padrão;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Policial implements Observer {

	private Direcao direcao;

	@Override
	public void update(Observable observable, Object obj) {
		
		if (obj instanceof Direcao) {
			this.direcao = (Direcao) obj;	
		}
	}
	
	@Override
	public String toString() {
		return "Policial [Indo para " + direcao + "]";
	}
	
}
