package gestorEventos;

public class Cliente {
	private int id; 
	private String Name;
	private double dinero;
	private boolean entrada;
	
	
	
	public Cliente(int id, String name, double money) {
		super();
		this.id = id;
		Name = name;
		this.dinero = money;
		this.entrada = false;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public boolean getEntrada() {
		return entrada;
	}

	public void setEntrada(boolean entrada) {
		this.entrada = entrada;
	} 
	
	public String toString() {
		return this.Name;
	}
	
	
	
	
	
	
}
