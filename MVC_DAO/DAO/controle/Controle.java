package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_bo.PessoaBo;
import model_bo.Verificar;
import model_dao.Banco;
import model_vo.PessoaVo;
import view.Tela;

public class Controle implements ActionListener{

	private Tela tela;
	private PessoaBo pessoaBo;
	private Banco banco;
	private Verificar verificar;
	
	public Controle() {
		
		tela = new Tela();
		pessoaBo = PessoaBo.getInstance();
		banco = Banco.getInstace();
		verificar = Verificar.getInstance();
		
		tela.getBtnAdd().addActionListener(this);
		tela.getBtnSair().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == tela.getBtnAdd())
		{
			if(verificar.verificarSalvar(tela))
			{
				pessoaBo.salvarPessoaVo(new PessoaVo(
						tela.getTfdNome().getText().trim(), 
						tela.getTfdCpf().getText().trim(), 
						Integer.parseInt(tela.getTfdIdade().getText().trim())), 
						banco);				
			}
		}
		if(obj == tela.getBtnSair())
			System.exit(0);
	}
	
}
