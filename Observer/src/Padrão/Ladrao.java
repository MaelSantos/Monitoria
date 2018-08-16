package Padr�o;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Ladrao extends Observable {

	private Direcao movimento;

	public void baixo()
	{
		movimento = Direcao.baixo;
		avisarObservadores();
	}
	public void cima()
	{
		movimento = Direcao.cima;
		avisarObservadores();
	}
	public void esquerda()
	{
		movimento = Direcao.esquerda;
		avisarObservadores();
	}
	public void direita()
	{
		movimento = Direcao.direita;
		avisarObservadores();
	}
	
	public void avisarObservadores() {
		setChanged();
		notifyObservers(movimento);//atualiza a dire�ao dos seus observadores
	}
	@Override
	public String toString() {
		
		return "Ladrao [Indo para " + movimento + "]";
	}

}
