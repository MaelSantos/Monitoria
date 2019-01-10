package agregação;

/**
 * @author Abimael Santos
 * Classe serve como parte de um Cliente 
 */
public class Telefone {

	private String numero;
	private String tipo;
	
	public Telefone(String numero, String tipo) {
		
		this.numero = numero;
		this.tipo = tipo;
	}

	//metodos de acesso
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
