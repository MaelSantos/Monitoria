package view;

public class Fase extends PanelGeral{

	private static final long serialVersionUID = -6879927233338926169L;
	
	private Inventario inventario;
	
	public Fase() {
		super("Fase");
		
		setLayout(null);
		
		inventario = new Inventario();
		
		add(inventario).setBounds(350, 0, 150, 500);
	}

	@Override
	public void setVisible(boolean aFlag) {
		super.setVisible(aFlag);
		
		if(inventario != null)
			inventario.setVisible(aFlag);
	}
	
	public Inventario getInventario() {
		return inventario;
	}
	
}
