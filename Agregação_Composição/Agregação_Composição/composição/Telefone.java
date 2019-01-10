package composição;

public class Telefone {

	private String numero;
	private String tipo;
	private Cliente cliente;
	
	public Telefone(String string, String tipo, int index, Cliente cliente) {
		
//		this.numero = numero;
//		this.tipo = tipo;
//		this.cliente = cliente;
		
		cliente.getTelefones()[index] = this;
		cliente.getTelefones()[index].setNumero(string);
		cliente.getTelefones()[index].setTipo(tipo);
	}

	public Telefone(Cliente cliente) {
		this.cliente = cliente;
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
