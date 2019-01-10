package modelVo;

public class Produto {
	
	private double valor;
	private String nome;
	private int quant;
	
	public Produto(double valor, String nome, int quant) {
		this.valor = valor;
		this.nome = nome;
		this.quant = quant;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

}

