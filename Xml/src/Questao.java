
public class Questao {

	private int valor1;
	private int valor2;
	private int resposta;

	public Questao(int valor1, int valor2, int resposta) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.resposta = resposta;
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getResposta() {
		return resposta;
	}

	public void setResposta(int resposta) {
		this.resposta = resposta;
	}

	@Override
	public String toString() {
		return valor1+" + "+valor2+" = "+resposta;
	}
	
}
