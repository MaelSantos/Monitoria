package model;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Personagem extends Elemento{
	
	private Sprite sprite;
	private int passos;
	private String direcao;
	private BufferedImage image;
	
	public Personagem(int x, int y, String endereco) {
		super(x,y);
		sprite = new Sprite(endereco, 1, 1);
		image = sprite.getSprites()[0];
//			this.image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(endereco));
	}

	public void andar()
	{
		switch (direcao) {
		case "sul":
			setY(getY() + passos);
			break;
		case "norte":
			setY(getY() - passos);
			break;
		case "leste":
			setX(getX() + passos);
			break;
		case "oeste":
			setX(getX() - passos);
			break;
		default:
			break;
		}
	}
	
	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public int getPassos() {
		return passos;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setPassos(int passos) {
		this.passos = passos;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}
	
	
	
}
