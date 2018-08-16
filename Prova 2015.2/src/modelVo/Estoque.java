package modelVo;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	private List<Produto> produtos;
	
	public Estoque() {
		produtos = new ArrayList<Produto>();
	}
	
	public Estoque(ArrayList<Produto> produto) {
		this.produtos = produto;
	}

	public List getProdutos() {
		return produtos;
	}

	public void darBaixa(Produto produto, int quatVendida)
	{
		for(Produto p : produtos)
			if(p.equals(produto))
				produto.setQuant(produto.getQuant() - quatVendida);
	}
	
}
