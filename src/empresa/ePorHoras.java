package empresa;

public class ePorHoras implements empleado {

	private String nombre; 
	private int ID; 
	private double tarifaPorHora; 
	private int horasTrabajadas; 
	

	public ePorHoras(String nombre, int iD, double tarifaPorHora, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		ID = iD;
		this.tarifaPorHora = tarifaPorHora;
		this.horasTrabajadas = horasTrabajadas;
	}

	public String obtenerNombre() {
		String Name = this.nombre;
		return Name;
	}

	@Override
	public int obtenerID() {
		int ID = this.ID;
		return ID;
	}

	@Override
	public double calculoDeSalario() {
		double tarifa = this.tarifaPorHora;
		int horas = this.horasTrabajadas;
		
		double salarioTotal = tarifa * horas; 
		
		return salarioTotal;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Info del Empleado por horas: ");
		System.out.println("Nombre " + obtenerNombre());
		System.out.println("ID: " + obtenerID());
		System.out.println("Salario: " + calculoDeSalario());
		
	}

}
