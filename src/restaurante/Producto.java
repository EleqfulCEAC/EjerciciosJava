package restaurante;

public class Producto {
	private String Nombre;
	private double precio; 
	
	
	public double getPrecio() {
		return precio;
	}
	
	public String getName() {
		return Nombre;
	}




	public Producto(String nombre, double precio) {
		super();
		Nombre = nombre;
		this.precio = precio;
	} 
	
	
	
	
}
