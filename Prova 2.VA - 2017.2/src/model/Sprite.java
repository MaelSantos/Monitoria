package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import view.Mensagem;

public class Sprite{
	BufferedImage spriteSheet;   

	int width, height;
	int rows, columns;
	public BufferedImage[] sprites;

	public Sprite(String arquivo, int columns, int rows) {
		try {
			spriteSheet=  ImageIO.read(getClass().getClassLoader().getResourceAsStream(arquivo));
		} catch (IOException e) {
			Mensagem.exibirMensagem("Erro ao carregar mensagem!!!");
			e.printStackTrace();
		}
//		this.width = width;
//		this.height = height;
		
		this.width = spriteSheet.getWidth()/columns;
		this.height = spriteSheet.getHeight()/rows;

		this.rows = columns;
		this.columns = rows;

		sprites = new BufferedImage[columns * rows];
			for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				sprites[(i * rows) + j] = spriteSheet.getSubimage(i * width, j * height, width, height);
			}
		}
	}

	public BufferedImage[] getSprites() {
		return sprites;
	}
}