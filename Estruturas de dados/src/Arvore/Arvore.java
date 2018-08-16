package Arvore;

//#include <stdio.h>
//#include <stdlib.h>

//struct No
//{
//    int elemento;
//    struct No *esquerda;
//    struct No *direita;
//};
//
//typedef struct No no_arvore;

//Funcoes
//void inicializacao(no_arvore **raiz);
//void adicionar(no_arvore **raiz,int valor);
//void visualiza_pre_ordem(no_arvore **raiz);
//void visualiza_ordem(no_arvore **raiz);
//void visualiza_pos_ordem(no_arvore **raiz);
//int contar_nos(no_arvore **raiz);
//int contar_folhas(no_arvore **raiz);
//int maior(int a, int b);
//int altura_arvore(no_arvore **raiz);
//void procurar_no(no_arvore **raiz,int pesq);
//
//no_arvore *menor_esquerda(no_arvore **raiz);
//no_arvore *maior_direita(no_arvore **raiz);
//void remover(no_arvore **raiz,int valor);

public class Arvore
{

	public Arvore() {

//		No raiz = null;
//		inicializacao(raiz);

//		adicionar(raiz,10);
//		adicionar(raiz,4);
//		adicionar(raiz,17);
//		adicionar(raiz,1);
//		adicionar(raiz,5);
//		adicionar(raiz,16);
//		adicionar(raiz,21);
//
//
//		//remover(&raiz,10);
//
//		System.out.println("Visualizacao pre-ordem: ");
//		visualiza_pre_ordem(raiz);
//
//		System.out.println("Visualizacao ordem: ");
//		visualiza_ordem(raiz);
//
//		System.out.println("Visualizacao pos-ordem: ");
//		visualiza_pos_ordem(raiz);
//
//		System.out.println("Existem "+contar_nos(raiz)+" nos!!!");
//		System.out.println("Existem "+contar_folhas(raiz)+" folhas!!!");
//		System.out.println("Altura da arvore: "+altura_arvore(raiz));
//		procurar_no(raiz,27);

	}


	void inicializacao(No raiz)
	{
		raiz = null; //a raiz vai apontar para null
	}

	void adicionar(No raiz,int valor)
	{
		if(raiz == null) //verifica se a arvore esta vazia...tambem verefica se o nó tem filhos
		{
			//			*raiz = (no_arvore*)malloc(sizeof(no_arvore));//aloca memoria para a raiz
			raiz = new No();
			raiz.direita = null; //ponteiro direita aponta para null
			raiz.esquerda = null; //ponteiro esquerda  aponta para null
			raiz.valor = valor; //recebe o valor para a raiz
		}
		else //se ouver algum elemento na arvore
		{
			if(valor < raiz.valor) //verifica se é menor que o elemento anterior
			{
				if(raiz.esquerda != null)
				{
					adicionar(raiz.esquerda,valor); //se for menor vai para a esquerda
					return;
				}
				else
				{
					raiz.esquerda = new No();
					raiz.valor = valor;
				}
			}
			else if(valor > raiz.valor) //verifica se é maior que o elemento anterior
			{
				if(raiz.direita != null)
				{
					adicionar(raiz.direita,valor); //se for maior vai para direita
					return;					
				}
				else
				{
					raiz.direita = new No();
					raiz.valor = valor;
				}
			}
			else if(valor == raiz.valor) //verifica se existe algum elemento igual
			{
				System.out.println("Esse numero ja existe!!!");
				return;
			}
		}
	}

	void visualiza_pre_ordem(No raiz)
	{
		if(raiz != null)//verifica se esta vazia
		{
			System.out.println("Valor: "+raiz.valor); //visita-se primeiro a raiz
			visualiza_pre_ordem(raiz.esquerda); //sempre visita o lado direito antes do esquerdo
			visualiza_pre_ordem(raiz.direita); //por ultimo visita-se o lado direito
		}
	}

	void visualiza_ordem(No raiz)
	{
		if(raiz != null)//verifica se esta vazia
		{
			visualiza_ordem(raiz.esquerda); //sempre visita o lado direito antes do esquerdo
			System.out.println("Valor: "+raiz.valor); //visita-se a raiz
			visualiza_ordem(raiz.direita); //por ultimo visita-se o lado direito
		}
	}

	void visualiza_pos_ordem(No raiz)
	{
		if(raiz != null) //verifica se esta vazia
		{
			visualiza_pos_ordem(raiz.esquerda); //sempre visita o lado direito antes do esquerdo
			visualiza_pos_ordem(raiz.direita); //visita-se o lado direito
			System.out.println("Valor: "+raiz.valor); //visita-se a raiz por ultimo
		}
	}

	int contar_nos(No raiz)
	{
		if(raiz == null)//verifica se esta vazia
			return 0;
		else
			return 1 + contar_nos(raiz.esquerda) + contar_nos(raiz.direita); //conta os nos que exitem na esquerda e na direita
	}

	int contar_folhas(No raiz)
	{
		if(raiz == null)//verifica se ta vazia...ponto de parada
			return 0;
		if((raiz.esquerda == null) && (raiz.direita == null))//verifica se é uma folha...ponto de parada
			return 1;
		else
			return contar_folhas(raiz.esquerda) + contar_folhas(raiz.direita);//conta os nós da arvore
	}

	int maior(int a, int b)
	{
		if(a > b)//se "a" for maior
			return a;//retorn "a"
		else //se nao
			return b; //retorna "b"

	}

	int altura_arvore(No raiz)
	{
		//verifica se esta vazia ou é uma folha...ponto de parada
		if((raiz == null) || (raiz.esquerda == null && raiz.direita == null))
			return 0;
		else //verifica a altura
			return 1 + maior(altura_arvore(raiz.esquerda), altura_arvore(raiz.direita));
	}

	void procurar_no(No raiz,int pesq)
	{
		if(raiz == null)//verifica se esta vazia...ponto de parada
		{
			System.out.println("Valor Nao Encontrado!!!");
			return;
		}
		if(raiz.valor == pesq)//verifica se os valores sao iguais...ponto de parada
		{
			System.out.println("Valor "+pesq+" Encontrado!!!");
			return;
		}
		//percorre a arvore recursivamente
		else if(pesq < raiz.valor)//verifica se o valor é menor do que o elemento procurado
		{
			System.out.println(" > "+raiz.valor);
			procurar_no(raiz.esquerda,pesq);//se for menor vai para esquerda
			return;
		}
		else if(pesq > raiz.valor)//verifica se o valor é maior
		{
			System.out.println(" > "+raiz.valor);
			procurar_no(raiz.direita,pesq);//se for maior vai para a direita
			return;
		}

	}

	No maior_direita(No raiz)
	{
		if(raiz.direita != null)
		{
			return maior_direita(raiz.direita);
		}
		else
		{
			No aux = raiz;
			if(raiz.esquerda != null)
			{
				raiz = raiz.esquerda;
			}
			else
				raiz = null;
			return aux;
		}
	}

	No menor_esquerda(No raiz)
	{
		if(raiz.esquerda != null)
		{
			return menor_esquerda(raiz.esquerda);
		}
		else
		{
			No aux = raiz;
			if(raiz.direita != null)
			{
				raiz = raiz.direita;
			}
			else
				raiz = null;
			return aux;
		}
	}

	void remover(No raiz,int valor)
	{
		if(raiz == null) //verifica se ta vazia...ponto de parada
		{
			return;
		}
		if(valor < raiz.valor) //verifica se o valor é menor
		{
			remover(raiz.esquerda,valor); //se for menor vai para a esquerda
		}
		else
			if(valor > raiz.valor)//verifica se o valor é maior
			{
				remover(raiz.direita,valor);//se for maior vai para direita
			}
			else //se nao os valores sao iguias
			{
				No aux = raiz; //cria uma aux apontando para a raiz
				if(aux.esquerda == null && aux.direita == null) //verfica se a raiz tem filhos
				{
					//					free(aux);//se nao tiver filhos
					raiz = null;// simplemsnte remover a raiz
				}
				else if(aux.esquerda == null)//verifica se so tem filho direito
				{
					raiz = raiz.direita;//a raiz vai ser o fllho direiot...o filho vai tomar o lugar do pai(raiz)
					aux.direita = null;//remover
					//					free(aux);//remove a raiz
					aux = null;
				}
				else if(aux.direita == null)//vereifica se so tem filho esquerdo
				{
					raiz = raiz.esquerda;//a raiz vai ser o filho esquerdo...o filho vai tomar o lugar do pai(raiz)
					aux.esquerda = null;
					//					free(aux);//remove a raiz
					aux = null;
				}
				else
				{
					aux = maior_direita(raiz.esquerda);
					aux.esquerda = raiz.esquerda;
					aux.direita = raiz.direita;
					raiz.esquerda = raiz.direita = null;
					//					free(raiz);
					raiz = aux;
					aux = null;
					//					free(aux);
				}

			}
	}
}