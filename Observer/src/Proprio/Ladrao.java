package Proprio;

import Padrão.Direcao;

public class Ladrao extends Observado{

	private Direcao direcao;

	public void baixo()
	{
		direcao = Direcao.baixo;
		notificarObservadores(direcao);
	}
	public void cima()
	{
		direcao = Direcao.cima;
		notificarObservadores(direcao);
	}
	public void esquerda()
	{
		direcao = Direcao.esquerda;
		notificarObservadores(direcao);
	}
	public void direita()
	{
		direcao = Direcao.direita;
		notificarObservadores(direcao);
	}
	
	@Override
	public String toString() {
		return "Ladrao [Indo para " + direcao + "]";
	}

}
