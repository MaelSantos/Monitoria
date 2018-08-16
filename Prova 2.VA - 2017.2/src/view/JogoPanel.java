package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Personagem;

public class JogoPanel extends PanelGenerico {
	
	private BufferedImage fundo;
	
	public JogoPanel() {
			
		fundo = new BufferedImage(Tela.LARGURA, Tela.ALTURA, BufferedImage.TYPE_4BYTE_ABGR);
		
		setVisible(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {

		g.drawImage(fundo, 0, 0, null);
	
	}
	
	
}
