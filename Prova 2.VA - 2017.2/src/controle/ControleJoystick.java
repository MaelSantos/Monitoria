package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.event.AncestorEvent;

import model.CampoPassoVazio;
import model.Personagem;
import view.TelaJogo;
import view.TelaJoystick;

public class ControleJoystick implements ActionListener{

	//views
	private TelaJoystick joystick;
	private TelaJogo TelaMario;
	private TelaJogo TelaLuigi;

	//models
	private Personagem mario,luigi;

	private int passos;

	public ControleJoystick(TelaJoystick joystick, TelaJogo telaMario,
			TelaJogo telaLuigi, Personagem mario, Personagem luigi) {

		this.joystick = joystick;
		this.TelaMario = telaMario;
		this.TelaLuigi = telaLuigi;

		this.mario = mario;
		this.luigi = luigi;
	}

	public void control() throws CampoPassoVazio{

		try {
		joystick.getTfdPassos().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					passos = Integer.parseInt(joystick.getTfdPassos().getText());
					mario.setPassos(passos);
					luigi.setPassos(passos);
			}
		});
		
		} catch (Exception e2) {
			throw new CampoPassoVazio("Digite a quantidade de passos do personagem");
		}

		joystick.getCima().addActionListener(this);
		joystick.getBaixo().addActionListener(this);
		joystick.getDireita().addActionListener(this);
		joystick.getEsquerda().addActionListener(this);

		KeyHandler handler = new KeyHandler();
		Tadapter tadapter = new Tadapter();

		TelaMario.addKeyListener(handler);
		TelaLuigi.addKeyListener(handler);
		joystick.addKeyListener(handler);
		
		TelaMario.addKeyListener(tadapter);
		TelaLuigi.addKeyListener(tadapter);
		joystick.addKeyListener(tadapter);

	}
	
	private void atualizarTelas() {
		
//		TelaLuigi.getJogoPanel().repaint();
//		TelaMario.getJogoPanel().repaint();
		
		TelaLuigi.repaint();
		TelaMario.repaint();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		System.out.println("evento");

		if(obj == joystick.getCima())
		{
			mario.setDirecao("norte");
			mario.andar();
			luigi.setDirecao("norte");
			luigi.andar();
			
			atualizarTelas();
		}
		if(obj == joystick.getBaixo())
		{
			mario.setDirecao("sul");
			mario.andar();

			luigi.setDirecao("sul");
			luigi.andar();
			
			atualizarTelas();
		}
		if(obj == joystick.getEsquerda())
		{
			mario.setDirecao("oeste");
			mario.andar();

			luigi.setDirecao("oeste");
			luigi.andar();
			
			atualizarTelas();
		}
		if(obj == joystick.getDireita())
		{
			mario.setDirecao("leste");
			mario.andar();
			luigi.setDirecao("leste");
			luigi.andar();

			atualizarTelas();
		}

	}

	private class KeyHandler implements KeyListener{ //extends keyAdapter

		@Override
		public void keyPressed(KeyEvent e) {

			int tecla = e.getKeyCode();

			switch (tecla) {
			case KeyEvent.VK_ESCAPE:
				System.exit(0);
				break;
			case KeyEvent.VK_BACK_SPACE:
				TelaLuigi.setVisible(true);
				TelaMario.setVisible(true);
				break;
			default:
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Stub de método gerado automaticamente

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Stub de método gerado automaticamente

		}	
	}

	public class Tadapter extends KeyAdapter{
		
		@Override
		public void keyPressed(KeyEvent e) {

			int tecla = e.getKeyCode();

			switch (tecla) {
			case KeyEvent.VK_UP:
				mario.setDirecao("norte");
				mario.andar();
				luigi.setDirecao("norte");
				luigi.andar();
				
				atualizarTelas();
				break;
			case KeyEvent.VK_DOWN:
				mario.setDirecao("sul");
				mario.andar();

				luigi.setDirecao("sul");
				luigi.andar();
				
				atualizarTelas();
				break;
			case KeyEvent.VK_LEFT:
				mario.setDirecao("oeste");
				mario.andar();

				luigi.setDirecao("oeste");
				luigi.andar();
				
				atualizarTelas();
				break;
			case KeyEvent.VK_RIGHT:
				mario.setDirecao("leste");
				mario.andar();

				luigi.setDirecao("leste");
				luigi.andar();
				
				atualizarTelas();
				break;
			default:
				break;
			}
		}
	}
}

