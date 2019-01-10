package model_bo;

import view.Tela;

public class Verificar {
	
	private static Verificar verificar;
	
	private Verificar() {
	}
	
	public static Verificar getInstance()
	{
		if (verificar == null) 
			verificar = new Verificar();
		return verificar;
	}
	
	public boolean verificarSalvar(Tela tela)
	{
		if(tela.getTfdNome().getText().trim().equals("") ||
					tela.getTfdCpf().getText().trim().equals("") ||  
					tela.getTfdIdade().getText().trim().equals(""))
			return false;
		
		try {
			
			if(Integer.parseInt(tela.getTfdIdade().getText().trim()) <= 0)
				return false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
}
