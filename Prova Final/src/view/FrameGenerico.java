package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class FrameGenerico extends JFrame{

	public static final int LARGURA = 200;
	public static final int ALTURA = 600;
	
	public FrameGenerico() {
		
		super("Catalogo");
		
		setSize(LARGURA, ALTURA);
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
		
		setVisible(false);
		
	}
	
}
