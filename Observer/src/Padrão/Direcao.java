package Padrão;

public enum Direcao {

	cima("Cima"), baixo("Baixo"), esquerda("Esquerda"), direita("Direita");

	String direcao;

	Direcao(String direcao) {
		this.direcao = direcao;
	}

	@Override
	public String toString() {

		return direcao;

	}

}
