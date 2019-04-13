package Classe;

//interfaces s�o um contrato onde todas as classes que a implementarem s�o obrigados a sobrescrever os metodos
public interface Felino {

	public static final String raca = "Felino";//a interface somente pode ter atributos estaticos e constantes
	
	public String falar();//na interface somente pode ter a declara��o do metodo
	
	/*
	 * A exce��o s�o os metodos default
	 * um metodo default serve como o mesmo para todos que implementarem a interface
	 */
	public default String falarDefault()
	{
		return "Default";
	}
}
