package Proprio;

import Padrão.Direcao;

public class Policial implements Observador{

	private Direcao direcao;

	@Override
	public void atualizar(Object object) {
		
		if (object instanceof Direcao) {
			this.direcao = (Direcao) object;	
		}
	}
	
	@Override
	public String toString() {
		return "Policial [Indo para " + direcao + "]";
	}

	
}
