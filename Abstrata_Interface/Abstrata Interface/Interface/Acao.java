package Interface;

public interface Acao {

	/**
	 * Interface só pode ter atributos constantes estaticas
	 * qualquer atributo declarado será implicitamente públicos e abstratos. 
	 */
	public static final String mensagem = "[ Default ] falando";
	
	//assinatura dos metodos que devem ser sobrescritos 
	/**
	 * @return String
	 * a interface só tem a declaração de metodos 
	 * é como se uma classe que implementa a interface fizesse um contrato com ela 
	 * e tivesse que sobrescrever os metodos presentes presentes nela
	 */
	public String falar();
	/**
	 * @param mensagem
	 * Exemplo de sobrecarga de metodo,
	 * dois metodos com o mesmo nome, mas com ou atributos, ou retorno diferente, 
	 * ou tipo de parametros difentes 
	 */
	public void falar(String mensagem);
	
	/**
	 * A interface pode implementar metodos default que fazem alguma funcionalidade por padrão 
	 */
	public default void falarDefault()
	{
		System.out.println(mensagem);
	}
	
}
