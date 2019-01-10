package Generalização;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);		
	}
	
	//sobreposição de metodos 
	@Override
	public String cargo() {
		return "Gerente";
	}
	
	//sobrecarga de metodos 
	public double darDesconto(double valor)
	{
		return valor - (valor *0.15);
	}
	
	public double darDesconto(float valor)
	{
		return valor - (valor *0.15);
	}
	
	public double darDesconto(int valor)
	{
		return ( (double) (valor - (valor *0.15)) );
	}
	
	public void reajusteSalario(Funcionario funcionario)
	{
		if(! (funcionario.equals(this)) )
		{
			if (funcionario instanceof Desenvolvedor) {
				funcionario.setSalario(funcionario.getSalario() + (funcionario.getSalario() * 0.5));
			}	
		}
	}
	
}
