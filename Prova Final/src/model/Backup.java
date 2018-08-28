package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;

public class Backup {

	private static List<Dvd> dvds = new ArrayList<>();
	private static List<Livro> livros = new ArrayList<>();
	
	public static void backup() throws BackupException, IOException
	{
		XStream xStream = new XStream(new Dom4JDriver());
		
		File fileDvd = new File("arquivo/dvd.xml");
		
		if(!fileDvd.exists())
			fileDvd.createNewFile();
		else
		{
			fileDvd.delete();
			fileDvd.createNewFile();
		}
		File fileLivro = new File("arquivo/dvd.xml");
		
		if(!fileLivro.exists())
			fileLivro.createNewFile();
		else
		{
			fileLivro.delete();
			fileLivro.createNewFile();
		}	
		
		xStream.alias("Dvd", Dvd.class);
		xStream.alias("Livro", Livro.class);
		xStream.toXML(dvds, new FileOutputStream(fileDvd));
		xStream.toXML(livros, new FileOutputStream(fileLivro));
	}
	
	public static boolean adicionarItem(Dvd dvd)
	{
		for(Dvd c : dvds)
			if(dvd.equals(c))
				return false;
		dvds.add(dvd);
		return true;
	}
	public static boolean adicionarItem(Livro livro)
	{
		for(Livro c : livros)
			if(livro.equals(c))
				return false;
		livros.add(livro);
		return true;
	}
}
