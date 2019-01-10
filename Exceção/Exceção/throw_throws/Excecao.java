package throw_throws;

public class Excecao extends Exception{

	public Excecao() {
		super("Dividindo por zero");
	}
	
	public Excecao(String mensagem)
	{
		super(mensagem);
	}
	
}
