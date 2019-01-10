package view;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TelaExibir extends FrameGenerico{

	private JTextArea tfaExibir;
	
	public TelaExibir() {
		
		tfaExibir = new JTextArea();
		
		setLayout(new BorderLayout());
		setSize(400, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(new JScrollPane(tfaExibir), BorderLayout.CENTER);
		
	}

	public JTextArea getTfaExibir() {
		return tfaExibir;
	}
	
}
