package clases2;

public class Vehiculo {
	private String Matricula; 
	private String Marca;
	private String Modelo;
	private int MaxVelocidad;
	
	/*Constructor con parametros*/
	
	public Vehiculo(String matricula, String marca, String modelo, int maxVelocidad) {
		super();
		Matricula = matricula;
		Marca = marca;
		Modelo = modelo;
		
		if(maxVelocidad > 0) {
			MaxVelocidad = maxVelocidad;			
		} else {
			MaxVelocidad = 0; 
		}
	} 
	
	
	/*Constructor con modelo y maxvloc*/	
	
	public Vehiculo(String matricula, String marca) {
		this.Matricula = matricula; 
		this.Marca = marca; 
		this.Modelo = "A1"; 
		this.MaxVelocidad = 100; 
		
	}
	
	public void UpgradeMaxVelocity (int newMax) {
		if(newMax > 0) { 
			this.MaxVelocidad = newMax;
		} else {
			MaxVelocidad = 0;
		}
		
	}
	
	public void ChangeModel (String newModel) {
		if(!this.Modelo.equals(newModel)) {
			this.Modelo = newModel; 
		} 
		
	}
	
	public void ShowVehicleInfo() {
		System.out.println("Matricula: " + this.Matricula);
		System.out.println("Marca: " + this.Marca);
		System.out.println("Modelo: " + this.Modelo);
		System.out.println("Velocidad Maxima: " + this.MaxVelocidad);
	}
	
	
	
	
}
