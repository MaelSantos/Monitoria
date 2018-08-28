package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;

import model.Backup;
import model.BackupException;
import model.CaracterException;
import model.Catalogo;
import model.Dvd;
import model.Livro;
import model.ValidarCaracterException;
import view.Confirmar;
import view.TelaCadastro;
import view.TelaCadastroCatalogo;
import view.TelaExibir;

public class ControleButton {

	private TelaCadastro cadastro;
	private TelaCadastroCatalogo cadastroCatalogo;
	private TelaExibir exibir;

	public ControleButton(TelaCadastro cadastro, TelaCadastroCatalogo cadastroCatalogo, TelaExibir exibir) {
		super();
		this.cadastro = cadastro;
		this.cadastroCatalogo = cadastroCatalogo;
		this.exibir = exibir;

		control();
	}

	private void control() {

		cadastro.getBtnCadastro().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cadastroCatalogo.setVisible(true);
				cadastro.setVisible(false);

			}
		});

		cadastro.getBtnSair().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (Confirmar.confirmar("Deseja Realmente Sair?"))
					System.exit(0);

			}
		});

		cadastro.getBtnSalvar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					Backup.backup();
				} catch (BackupException | IOException e1) {
					Confirmar.mensagem("Erro ao fazer o backup");
					e1.printStackTrace();
				}

			}
		});

		cadastroCatalogo.getBtnAdd().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					
					validarCampo();
					
					if (cadastroCatalogo.getCbxTipo().getSelectedItem().equals("Livro")) {
						ValidarCaracterException.validarCaracter(cadastroCatalogo.getTfdAno().getText());
						
						Livro livro = new Catalogo(
								cadastroCatalogo.getTfdCodigo().getText().trim(), 
								cadastroCatalogo.getTfdNome().getText().trim(),
								cadastroCatalogo.getTfdAutor().getText().trim(), 
								cadastroCatalogo.getTfdEditora().getText().trim(), 
								cadastroCatalogo.getTfdVolume().getText().trim(),
								Integer.parseInt(cadastroCatalogo.getTfdAno().getText().trim()));
						
						Backup.adicionarItem(livro);
					}
					if (cadastroCatalogo.getCbxTipo().getSelectedItem().equals("Dvd")) {
						ValidarCaracterException.validarCaracter(cadastroCatalogo.getTfdNumero().getText());
						
						Dvd dvd = new Catalogo(
								cadastroCatalogo.getTfdCodigo().getText().trim(), 
								cadastroCatalogo.getTfdNome().getText().trim(),
								cadastroCatalogo.getTfdAutor().getText().trim(), 
								cadastroCatalogo.getTfdGenero().getText().trim(),
								Integer.parseInt(cadastroCatalogo.getTfdNumero().getText().trim()));
						
						Backup.adicionarItem(dvd);
						
					}
					
					Confirmar.mensagem("Item Adicionado");
				} catch (Exception e1) {
					Confirmar.mensagem(e1.getMessage());
					e1.printStackTrace();
				}

			}
		});

		cadastroCatalogo.getBtnExibir().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				exibir.setVisible(true);
				exibir.getTfaExibir().setText(exibir.getTfaExibir().getText()+"\n\n"+cadastroCatalogo.recuperarDados());

			}
		});

		cadastroCatalogo.getBtnVoltar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cadastro.setVisible(true);
				cadastroCatalogo.setVisible(false);

			}
		});
	}

	public void validarCampo() throws Exception {
		String tipoCatalogo = cadastroCatalogo.getCbxTipo().getSelectedItem().toString();

		switch (tipoCatalogo) {
		case "Dvd":

			if(cadastroCatalogo.getTfdCodigo().getText().trim().equals("") ||
					cadastroCatalogo.getTfdNome().getText().trim().equals("") ||
					cadastroCatalogo.getTfdAutor().getText().trim().equals("") ||
					cadastroCatalogo.getTfdGenero().getText().trim().equals("") ||
					cadastroCatalogo.getTfdNumero().getText().trim().equals(""))
				throw new Exception("Todos Os Campos Devem Ser Preenchidos!!!");
			
			break;
		case "Livro":
			
			if(cadastroCatalogo.getTfdCodigo().getText().trim().equals("") ||
					cadastroCatalogo.getTfdNome().getText().trim().equals("") ||
					cadastroCatalogo.getTfdAutor().getText().trim().equals("") ||
					cadastroCatalogo.getTfdEditora().getText().trim().equals("") ||
					cadastroCatalogo.getTfdVolume().getText().trim().equals("") ||
					cadastroCatalogo.getTfdAno().getText().trim().equals(""))
				throw new Exception("Todos Os Campos Devem Ser Preenchidos!!!");

			break;

		default:
			break;
		}
	}

}
