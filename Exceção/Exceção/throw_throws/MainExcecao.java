package throw_throws;

public class MainExcecao {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		int a = 2;
		int b = 0;

		try {

			if(b == 0)
			{
				throw new Excecao();
			}
			else
				System.out.println(calculadora.divisao(a, b));

		} catch (Excecao e) {
			System.err.println("Erro na divisão: "+e.getMessage());
		}
	}
}