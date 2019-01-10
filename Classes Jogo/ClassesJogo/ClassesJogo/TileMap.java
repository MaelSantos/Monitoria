package ClassesJogo;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;

/**
 * Classe correspondente as camadas do tiled 
 */
public class TileMap {
	
	/**
	 * Altura do seu TileMap
	 * Somente de um Tile
	 */
	private int mapaAltura;
	/**
	 * Largura do seu TileMap
	 * Somente de um Tile
	 */
	private int mapaLargura;
	/**
	 * Altura do seu TileSet
	 */
	private int tileAltura;
	/**
	 * Largura do seu TileSet
	 */
	private int tileLargura;

	/**
	 * Camada de inteiros(int) referente a sua camada 
	 */
	private int camada[][];
	/**
	 * Largura da que seu TileMap(camada) ocupa na tela
	 */
	private int larguraTela;
	/**
	 * Altura da que seu TileMap(camada) ocupa na tela
	 */
	private int AlturaTela;

	/**
	 * Imagem Usada no Tileset
	 */
	private BufferedImage tileSet;
	/**
	 * Imagem de fundo do mapa.
	 * Utilizada para que o Graphics dbg desenhe em cima dela 
	 * 
	 */
	private BufferedImage mapa;

	/**
	 * Graphics usado para desenhar as imagens do mapa
	 */
	private Graphics2D dbg;
	
	/**
	 * @param mapaLargura
	 * @param mapaAltura
	 * @param tileLargura
	 * @param tileAltura
	 * @param nomeTileSet
	 * @param nomeMapaMatriz
	 */
	public TileMap(int mapaLargura, int mapaAltura, int tileLargura, int tileAltura, String nomeTileSet, String nomeMapaMatriz) {
		
		this.mapaLargura = mapaLargura;
		this.mapaAltura = mapaAltura;
		this.tileLargura = tileLargura;
		this.tileAltura = tileAltura;
		
		/*
		 * Calcula Largura e Altura totais da tela
		 */
		larguraTela = mapaLargura * tileLargura;
		AlturaTela = mapaAltura * tileAltura;
		
		/*
		 *Inicializa a imagem de fundo com aa largura e altura totais do mapa 
		 */
		mapa = new BufferedImage(larguraTela, AlturaTela, BufferedImage.TYPE_4BYTE_ABGR);
		/*
		 * O Graphics dbg recebe o Graphics a imagem de fundo
		 * ou seja ao utilizar ele você ira desenhar em cima dessa imagem de fundo
		 */
		dbg = mapa.createGraphics();
		
		try {
			/*
			 * inicializa a imagem do tilset
			 */
			tileSet=ImageIO.read(getClass().getClassLoader().getResourceAsStream(nomeTileSet));
		} catch (IOException e) {
			System.out.println("Não conseguiu ler o Tileset");
			e.printStackTrace();
		}
		
		/*
		 * chamada do metodo responsavel por carregar a matriz da camada
		 */
		camada = carregarMatriz(nomeMapaMatriz);
		
		montarMapa();
	
	}
	
	/**
	 * Metodo responsavel por calcular e desenhar no lugar correto os tiles de sua camada
	 */
	public void montarMapa() {

		int tile;
		int tileRow;
		int tileCol;
		int colunasTileSet=tileSet.getWidth()/tileLargura; //quantidade de colunas do seu tileset
		
		for (int i = 0; i < mapaLargura; i++) {
			for (int j = 0; j < mapaAltura; j++) {
				tile = (camada[i][j] != 0) ? (camada[i][j] - 1) : 55;
				tileRow = (tile / colunasTileSet) | 0;
				tileCol = (tile % colunasTileSet) | 0;
				dbg.drawImage(tileSet, (j * tileAltura), (i * tileLargura), (j * tileAltura) + tileAltura,
						(i * tileLargura) + tileLargura, (tileCol * tileAltura), (tileRow * tileLargura),
						(tileCol * tileAltura) + tileAltura, (tileRow * tileLargura) + tileLargura, null);

			}
		}
	}

	/**
	 * @return lista de Rectangle para calculo da colisão 
	 */
	public List<Rectangle> montarColisao() {
		List<Rectangle> tmp = new ArrayList<Rectangle>();
		for (int i = 0; i < mapaLargura; i++) {
			for (int j = 0; j < mapaAltura; j++) {
				if(camada[i][j] != 0) {
					tmp.add(new Rectangle( (j * tileAltura), (i * tileLargura), tileLargura, tileAltura));
				}		
			}
		}
		return tmp;
	}
	
	/**
	 * Carrega a matriz correspondente da sua camada
	 * 
	 * @param nomeMapa
	 * @return Matriz de inteiros (int) correspondentes a sua camada 
	 */
	public int[][] carregarMatriz(String nomeMapa) {
		int[][] matz = new int[mapaLargura][mapaAltura];

		InputStream input = getClass().getClassLoader().getResourceAsStream(nomeMapa);
		BufferedReader br = new BufferedReader(new InputStreamReader(input));

		List<String> linhas = new ArrayList<String>();
		String linha = "";

		try {
			while ((linha = br.readLine()) != null)
				linhas.add(linha);

			int coluna = 0;
			for (int i = 0; i < linhas.size(); i++) {
				StringTokenizer token = new StringTokenizer(linhas.get(i), ",");

				while (token.hasMoreElements()) {
					matz[i][coluna] = Integer.parseInt(token.nextToken());
					coluna++;
				}
				coluna = 0;
			}

		} catch (IOException e) {
			System.out.println("Não carregou Matriz");
			e.printStackTrace();
		}

		return matz;
	}

	/*
	 * Metodos Getters e Setters
	 */
	public BufferedImage getMapa() {
		return mapa;
	}
	public int getLarguraTela() {
		return larguraTela;
	}
	public int getAlturaTela() {
		return AlturaTela;
	}

}
