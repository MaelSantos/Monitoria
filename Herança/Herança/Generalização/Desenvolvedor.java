package Generalização;

public class Desenvolvedor extends Funcionario{

	//sobeposicao de atributos 
	public String salario;
	
	//sobrecarga de contrutores 
	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}
	
	public Desenvolvedor(String nome, double salario, double d) {
		super(nome, salario);
	}
	
	@Override
	public String cargo() {
		return "Funcionario";
	}
	
	public void testeSalario(double d, String... s)
	{
		this.salario = s[0]; //referencia a propria classe - objeto corrente 
		super.salario = d;//referencia a classe pai - superclasse 
		System.out.println(s[1]);
	}

	public static void main(String[] args) {
		
		Desenvolvedor d = new Desenvolvedor("", 10.0);
		
		d.testeSalario(10, "Maaeel","Wanderson");
		
	}
	
}
