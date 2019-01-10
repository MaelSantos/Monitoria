package composi��o;

import java.util.Date;

public class Cliente {

	private String nome;
	private Date nascimento;
	private String cpf_cnpj;
	private String genero;
	private String rg;
	private String email;
	private String estado_civil;
	private String resposavel;
	
	private Endereco endereco;
	private Telefone[] telefones = new Telefone[5];
	
	public Cliente(String nome, Date nascimento, String cpf_cnpj, String genero, String rg, 
			String email, String estado_civil, String resposavel) {
		
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf_cnpj = cpf_cnpj;
		this.genero = genero;
		this.rg = rg;
		this.email = email;
		this.estado_civil = estado_civil;
		this.resposavel = resposavel;
		
//		endereco = new Endereco(this);
//		for(int i = 0; i < telefones.length ; i++)
//			telefones[i] = new Telefone(this);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public String getResposavel() {
		return resposavel;
	}
	public void setResposavel(String resposavel) {
		this.resposavel = resposavel;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
		
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", nascimento=" + nascimento + ", cpf_cnpj=" + cpf_cnpj + ", genero=" + genero
				+ ", rg=" + rg + ", email=" + email + ", estado_civil=" + estado_civil + ", resposavel=" + resposavel
				+ ", endereco=" + endereco + ", telefones=" + telefones + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		
		Cliente  cliente = new Cliente("mael", new Date(), "000.000.000-00", "Masculino",
				"0000000000000-0", "Maelsantos777@gmail.com", "A espera de um milagre", "Deus");
		
		Endereco endereco = new Endereco("Quirino Cordeiro Magalhaes", "1240", "AABB", "Serra Talhada", 
				"PE", "Brasil", "Lugar de doido", "000.000-00", cliente);
		
//		Endereco endereco2 = new Endereco("S�o Sebasti�o", "41", "Centro", "Jati", 
//				"CE", "Brasil", "CU do mundo", "000.000-00", cliente);
		
		Telefone[] telefones = new Telefone[5];
		
		String[] tipos = {"Pessoal","Empresa","Emergencia","Segundario","Outro"};
		String[] numeros = {"(88)9 811693-73","(87)9 000000-00","(87)9 111111-11",
				"(87)9 222222-22", "(87)9 333333-33"};
		
		for(int i = 0; i < telefones.length; i++)
			telefones[i] = new Telefone(numeros[i], tipos[i], i, cliente);
		
		System.out.println(cliente.getEndereco());
		System.out.println(endereco);
		System.out.println(cliente.getTelefones()[0]);
		System.out.println(telefones[0]);
		
//		System.out.println(endereco.getRua());
//		System.out.println(endereco2.getRua());
//		
//		System.out.println(cliente.getEndereco().getRua());
	
	}

}
