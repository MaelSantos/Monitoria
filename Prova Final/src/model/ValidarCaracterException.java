package model;

public class ValidarCaracterException {

	public static void validarCaracter(String validar) throws CaracterException
	{
		if((!validar.matches("^[0-9]*$")) || validar.isEmpty())
			throw new CaracterException("Só é aceitos numeros!!!");
	}
	
}
