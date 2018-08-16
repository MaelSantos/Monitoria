package Proprio;

import java.util.ArrayList;

public class Observado{

	public ArrayList<Observador> observadores;
	
	public Observado() {
		observadores = new ArrayList<>();
	}
	
	public void addObservador(Observador observador)
	{
		observadores.add(observador);
	}
	
	public void notificarObservadores(Object object)
	{
		for(Observador o : observadores)
			o.atualizar(object);
	}
	
}
