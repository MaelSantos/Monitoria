package Lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class App {

	public static void main(String[] args) {
		
		// lista normal de elementos
		ArrayList<Usuario> usuarios = new ArrayList<>();//lista normal
		
		// interface a qual as outras classes para listas implementão
		List<Usuario> usuarios2 = new ArrayList<>();//lista inicializada utilizando a interface List
		
		//lista sincronizada e tem alocação difente da do arraylist
		Vector<Usuario> usuarios3 = new Vector<>();//lista sincronizada
		
		//semelhante ao arraylist, se diferete nos metodos de add e remove os quais gastam menos memoria e nos de get e set gastam mais memoria
		LinkedList<Usuario> usuarios4 = new LinkedList<>();//lista duplamente encadeada

		//adicionar novos elementos
		usuarios.add(new Usuario("Mael", 20));
		usuarios.add(new Usuario("Dani", 28));
		usuarios.add(new Usuario("Bruno", 20));
		
		//adiciona um novo elemento em um indice expecifico 
		usuarios.add(2, new Usuario("Rafael", 23));

		System.out.println(usuarios);
		
		//remover elementos
		usuarios.remove(0);//remover por indice, tem que saber exatamente o indice do objeto

		usuarios.remove(new Usuario("", 0));//remove passando o objeto

		usuarios.get(0);//retorna um valor da lista, tem que saber exatamente o indice do objeto

		usuarios.set(0, new Usuario("", 0));//substitui o objeto do indice informado, pelo novo objeto

		//embaralha a lista
		Collections.shuffle(usuarios);

		//Ordena a lista
		Collections.sort(usuarios, new Comparator<Usuario>() {

			@Override
			public int compare(Usuario o1, Usuario o2) {

				if (o1.getIdade() == o2.getIdade())
					return 0;// se for igual, se retornar zero ele não nada, os elementos vão continuar na mesma posição
				if (o1.getIdade() < o2.getIdade())
					return -1;// se for menor, o elemento menor vai para uma posição atras
				if (o1.getIdade() > o2.getIdade())
					return 1; // se for maior, o elemento maior vai para uma posição acima
				else
					return 0;
			}
		});
		
		//percorre a lista
//		for(int i = 0; i < usuarios.size(); i++)
//			System.out.println(usuarios.get(i));
		
		for(Usuario user : usuarios)
			System.out.println(user);

		//serve para verificar se um determinado objeto existe dentro da lista, retorn true se o objeto existir e false se não existir
		System.out.println(usuarios.contains(new Usuario("Mael", 20)));
		
		//verifica se a lista esta vazia
		System.out.println(usuarios.isEmpty());
		
		//mais uma maneira de percorrer a lista
		Iterator<Usuario> iterator = usuarios.iterator();
		
		while(iterator.hasNext())
		{
			Usuario usuario = iterator.next();
			System.out.println(usuario);
		}
		
		//retorna o indice do objeto, se o mesmo existir na lista
		int k = usuarios.indexOf(new Usuario("Mael", 20));
		System.out.println(k);
		
	}
}
