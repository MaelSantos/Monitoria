package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Sprite;

public class TelaJoystick extends Tela {

	private JPanel panel1, panel2;
	private Sprite imagensSetas;
	private JButton cima,baixo,esquerda,direita;
	private JLabel lblPassos;
	private JTextField tfdPassos;
	
	public TelaJoystick() {
		
		setLayout(new BorderLayout());
		setSize(180, 250);
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		
		imagensSetas = new Sprite("setas.jpg", 2, 2);
		
		cima = new JButton(new ImageIcon(imagensSetas.getSprites()[0]));
		baixo = new JButton(new ImageIcon(imagensSetas.getSprites()[1]));
		direita = new JButton(new ImageIcon(imagensSetas.getSprites()[2]));
		esquerda = new JButton(new ImageIcon(imagensSetas.getSprites()[3]));

		panel1.add(baixo,BorderLayout.SOUTH);
		panel1.add(cima, BorderLayout.NORTH);
		panel1.add(direita, BorderLayout.EAST);
		panel1.add(esquerda, BorderLayout.WEST);
		
		add(panel1, BorderLayout.CENTER);
		
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		
		lblPassos = new JLabel("Passos: ");
		tfdPassos = new JTextField(4);
		
		panel2.add(lblPassos);
		panel2.add(tfdPassos);
		
		add(panel2, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public JButton getCima() {
		return cima;
	}

	public JButton getBaixo() {
		return baixo;
	}

	public JButton getEsquerda() {
		return esquerda;
	}

	public JButton getDireita() {
		return direita;
	}

	public JTextField getTfdPassos() {
		return tfdPassos;
	}

	public JPanel getPanel1() {
		return panel1;
	}

	public JPanel getPanel2() {
		return panel2;
	}
	
}
