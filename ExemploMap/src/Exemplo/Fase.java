package Exemplo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * 
 * @author Abimael Santos
 * Classe responsavel por mostrar os componentes do jogo (players, cenario, etc)
 *
 */
public class Fase extends PanelGeral{ //todo panel se extende de PanelGeral

	/**
	 * Botão responsavel por encerrar a aplicação 
	 */
	private JButton btnSair;
	/**
	 * imagem da tela - serve como um plano de fundo para tudo que será pintado na tela,
	 * para serem pintados em cima dele
	 */
	private BufferedImage imagemTela;
	/**
	 * Graphics responsavel por pintar os outros componentes (players, cenario, etc) 
	 */
	private Graphics2D graficosTela;

	/**
	 * Iniciliza todos os componentes graficos 
	 */
	
	private String questao;
	public Fase() {
		super();
		
		requestFocus();//define que eu quero o foco nessa tela 
		imagemTela = new BufferedImage(TelaGeral.LARGURA, TelaGeral.ALTURA, BufferedImage.TYPE_4BYTE_ABGR);//inicializa a imagem de acordo com o tamanho da tela
		graficosTela = (Graphics2D) imagemTela.getGraphics();//inicializo o Graphics
		
		//inicializo bot�o sair
		btnSair = new JButton("Sair");
		//defino que ele tera um efeito arredondado
		btnSair.setBorderPainted(false); //tiro as bordas
		btnSair.setContentAreaFilled(false);
		btnSair.setFocusPainted(false);//tiro o foco

		add(btnSair).setBounds(10, 5, 50, 50);//como o layout � null eu adiciono definindo o local que ele estara na tela - pode ser feito separadamente

		btnSair.addActionListener(new ActionListener() { //adiciono o evento no bot�o por classe interna anonima 

			public void actionPerformed(ActionEvent e) {

				System.exit(0);//encerra a aplica��o

			}
		});

		setBorder(BorderFactory.createTitledBorder(""));
		
		questao = "N/A";
		
		setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) { //metodo responsavel por pintar os componentes da tela 
		
		g.drawImage(imagemTela, 0, 0, null);//pinto o "plano de fundo"em baixo de todos os componentes 
		
		//pinto o bot�o na tela
		g.setColor(Color.RED); //defino a cor
		g.fillOval(btnSair.getX(), btnSair.getY(), btnSair.getWidth(), btnSair.getHeight());//desenha uma forma oval na tela	
		g.setColor(Color.BLACK); //defino a cor
		g.drawOval(btnSair.getX(), btnSair.getY(), btnSair.getWidth(), btnSair.getHeight());//desenha um contorno oval na tela
		g.drawString(btnSair.getText(), btnSair.getX()+14, btnSair.getY()+30);//desenha o texto 
				
		g.drawString(questao, 100, 400);
		
	}
	
	/**
	 * @return o btnSair
	 */
	public JButton getBtnSair() {
		return btnSair;
	}

	/**
	 * @return o imagemTela
	 */
	public BufferedImage getImagemTela() {
		return imagemTela;
	}

	/**
	 * @return o graficosTela
	 */
	public Graphics2D getGraficosTela() {
		return graficosTela;
	}

	public String getQuestao() {
		return questao;
	}

	public void setQuestao(String questao) {
		this.questao = questao;
	}
			

}
