package composição;

public class Endereco {

	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private String complemento;
	private String cep;
	private Cliente cliente;
	
	public Endereco(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Endereco(String rua, String numero, String bairro, String cidade, String estado, String pais,
			String complemento, String cep, Cliente cliente) {

		cliente.setEndereco(this);
		cliente.getEndereco().setRua(rua);
		cliente.getEndereco().setNumero(numero);
		cliente.getEndereco().setBairro(bairro);
		cliente.getEndereco().setCidade(cidade);
		cliente.getEndereco().setEstado(estado);
		cliente.getEndereco().setPais(pais);
		cliente.getEndereco().setComplemento(complemento);
		cliente.getEndereco().setCep(cep);
		
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
