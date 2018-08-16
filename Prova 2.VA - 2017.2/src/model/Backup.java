package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;

public class Backup {
	
	public static void salvarPosicao(Personagem personagem) throws FileNotFoundException, IOException
	{
		File file = new File("arquivos/posicao.xml");
		OutputStream stream = null;
		XStream xstream = new XStream(new Dom4JDriver());
		xstream.alias("Personagem", Personagem.class);
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			else
			{
				file.delete();
				file.createNewFile();
			}
			
			stream = new FileOutputStream(file);
			xstream.toXML(personagem, stream);
			
		
	}
	
	public static Personagem ler()
	{
		Personagem personagem = null;
		File file = new File("arquivos/posicao.xml");
		XStream xStream = new XStream(new Dom4JDriver());
		
		try {
			
			if(file.exists())
			{
				personagem = (Personagem) xStream.fromXML(file);
			}
			
		} catch (Exception e) {
			
			System.err.println("Erro ao ler");
			
		}
		
		return personagem;
	}
	
}
