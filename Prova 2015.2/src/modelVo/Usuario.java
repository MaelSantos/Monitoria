package modelVo;

public abstract class Usuario{
	
	private String login, senha;

	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public boolean realizarLogin(Usuario user,Usuario userCadastrado)
	{
		if(user.getLogin().equalsIgnoreCase(userCadastrado.getLogin()) &&
				user.getSenha().equals(userCadastrado.getSenha()))
			return true;
		return false;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}