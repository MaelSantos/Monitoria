import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;

public class Xml {

	private List<Questao> questaos;
	private XStream xStream;
	private File file;

	public Xml() {

		xStream = new XStream(new Dom4JDriver());
		xStream.alias("Questao", Questao.class);
		
		file = new File("res/questoes.xml");
		questaos = new ArrayList<>();
	}

	public void salvar(Questao questao) {
		
		questaos.add(questao);

		try {
			if (!file.exists())
				file.createNewFile();
			else {
				file.delete();
				file.createNewFile();
			}
			
			OutputStream stream = new FileOutputStream(file);
			xStream.toXML(questaos, stream);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public List<Questao> ler()
	{
		try {
			if (!file.exists())
				file.createNewFile();
			else {
				return (List<Questao>) xStream.fromXML(file);				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
		
	}
	
	
	public List<Questao> getQuestaos() {
		return questaos;
	}
	
	public void setQuestaos(List<Questao> questaos) {
		this.questaos = questaos;
	}
	
	public static void main(String[] args) {
		
		Xml xml = new Xml();
		
		xml.setQuestaos(xml.ler());
		
		xml.salvar(new Questao(1, 1, 2));
		xml.salvar(new Questao(2, 2, 4));
		
		System.out.println(xml.ler());
		
	}
	
}
