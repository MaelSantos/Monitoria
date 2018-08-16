package Interface;

public interface Acao {

	//constante estatica
	public static final String mensagem = "[ Default ] falando";
	
	//assinatura dos metodos que devem ser sobrescritos 
	public String falar();
	
	public void falar(String mensagem);
	
	//metodo default
	public default void falarDefault()
	{
		System.out.println(mensagem);
	}
	
}
