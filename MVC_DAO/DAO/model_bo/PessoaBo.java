package model_bo;

import model_dao.Banco;
import model_vo.PessoaVo;

public class PessoaBo {

	private static PessoaBo bo;
	
	private PessoaBo() {
	}
	
	public static PessoaBo getInstance()
	{
		if(bo == null)
			bo = new PessoaBo();
		return bo;
	}
	
	public boolean salvarPessoaVo(PessoaVo pessoa, Banco banco)
	{
		for(PessoaVo p : banco.getPessoaVos())
			if(p.getNome().equalsIgnoreCase(pessoa.getNome()))
			{
				banco.addPessoa(pessoa);
				return true;
			}
		
		return false;
	}
	
}
