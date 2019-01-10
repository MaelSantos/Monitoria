package Arvore;

public class MainArvore {

	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		
		No raiz = new No();
		
		a.adicionar(raiz,10);
		a.adicionar(raiz,4);
		a.adicionar(raiz,17);
		a.adicionar(raiz,1);
		a.adicionar(raiz,5);
		a.adicionar(raiz,16);
		a.adicionar(raiz,21);
		a.adicionar(raiz,27);


		//remover(&raiz,10);

		System.out.println("Visualizacao pre-ordem: ");
		a.visualiza_pre_ordem(raiz);

		System.out.println("Visualizacao ordem: ");
		a.visualiza_ordem(raiz);

		System.out.println("Visualizacao pos-ordem: ");
		a.visualiza_pos_ordem(raiz);

		System.out.println("Existem "+a.contar_nos(raiz)+" nos!!!");
		System.out.println("Existem "+a.contar_folhas(raiz)+" folhas!!!");
		System.out.println("Altura da arvore: "+a.altura_arvore(raiz));
		a.procurar_no(raiz,27);
	}
	
}
