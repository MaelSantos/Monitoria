package modelVo;

public class Gerente extends Usuario {

	public Gerente(String login, String senha) {
		super(login, senha);
	}

	public void darDesconto(Venda venda)
	{
		if(venda.getTotal() > 1000)
		{
			venda.setTotal(venda.getTotal() - venda.getTotal() * 0.10);
		}
	}
	
	
}
