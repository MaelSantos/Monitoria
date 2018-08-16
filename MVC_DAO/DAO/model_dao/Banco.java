package model_dao;

import java.util.ArrayList;

import model_vo.PessoaVo;

public class Banco {

	private static Banco banco;
	private ArrayList<PessoaVo> pessoaVos;
	
	private Banco() {
		pessoaVos = new ArrayList<>();
	}
	
	public static Banco getInstace()
	{
		if(banco == null)
			banco = new Banco();
		return banco;
	}
	
	public void addPessoa(PessoaVo pessoaVo)
	{
		pessoaVos.add(pessoaVo);
	}

	//metodos getters e setters
	public ArrayList<PessoaVo> getPessoaVos() {
		return pessoaVos;
	}
	
	public void setPessoaVos(ArrayList<PessoaVo> pessoaVos) {
		this.pessoaVos = pessoaVos;
	}
}

