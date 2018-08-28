package model;

public class Catalogo implements Dvd, Livro{

	private String codigo, nome, autor, editora, volume, genero;
	private int ano, numero;
	
	public Catalogo(String codigo, String nome, String autor, String editora, String volume, int ano) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.volume = volume;
		this.ano = ano;
	}

	public Catalogo(String codigo, String nome, String autor, String genero, int numero) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.autor = autor;
		this.genero = genero;
		this.numero = numero;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String getInformacao(Livro livro) {
		return "Catalogo [codigo=" + codigo + ", nome=" + nome + ", autor=" + autor + ", editora=" + editora
				+ ", volume=" + volume + ", ano=" + ano + "]";
	}

	@Override
	public String getInformacao(Dvd dvd) {
		return "Catalogo [codigo=" + codigo + ", nome=" + nome + ", autor=" + autor + ", genero=" + genero + ", numero="
				+ numero + "]";
	}


	
	
}
