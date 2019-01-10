package throw_throws;

public class Calculadora {

	public double soma(double a, double b)
	{
		return a + b;
	}
	
	public double subtracao(double a, double b)
	{
		return a - b;
	}
	
	public double multipicacao(double a, double b)
	{
		return a * b;
	}
	
	public double divisao(double a, double b) throws Excecao
	{
//		if (b==0)
//			throw new Excecao();
//		else
			return a/b;
	}
	
}
