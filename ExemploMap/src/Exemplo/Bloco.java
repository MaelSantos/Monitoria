package Exemplo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class Bloco extends JLabel{

	private static final int VELOCIDADE = 1;
	private Color cor;
	private int x, y;
	private int largura, altura;

	public Bloco(Color cor, int x, int y, int largura, int altura) {
		super();
		this.cor = cor;
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
		
		setBounds(x, y, largura, altura);
		setBackground(cor);
		setForeground(cor);
	}

	public void draw(Graphics g) {
		g.setColor(cor);
		g.fillRect(x, y, largura, altura);
	}

	public void mover(String movimento) {

		switch (movimento) {
		case "cima":
			if (getY() > 0)
				setY(getY() - VELOCIDADE);
			break;
		case "baixo":
			if (getY() < TelaGeral.ALTURA - getAltura())
				setY(getY() + VELOCIDADE);
			break;
		case "direita":
			if (getX() < TelaGeral.LARGURA - getLargura())
				setX(getX() + VELOCIDADE);
			break;
		case "esquerda":
			if (getX() > 0)
				setX(getX() - VELOCIDADE);
			break;

		default:
			break;
		}
	}
	
	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
