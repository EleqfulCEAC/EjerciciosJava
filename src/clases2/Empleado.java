package clases2;

public class Empleado {
	private int IdEmpleado; 
	private String Nombre;
	private String RolEmpresarial; 
	private double Salario;
	
	/* Constructor con parametros */
	public Empleado(int idEmpleado, String nombre, String rolEmpresarial, double salario) {
		super();
		IdEmpleado = idEmpleado;
		Nombre = nombre;
		RolEmpresarial = rolEmpresarial;
		
		if(salario >= 0) {
			Salario = salario;			
		} else { 
			Salario = 0;
		}
	} 
	
	/*Constructor con valores predeterminados*/
	public Empleado(int idEmpleado, String nombre) {
		IdEmpleado = idEmpleado;
		Nombre = nombre; 
		RolEmpresarial = "Ayudante"; 
		Salario = 1000.00;
		
	}
	
	public void UpgradeSalary(int howMuch) {
		if (howMuch >= 1) {
			double aumento = this.Salario * howMuch / 100;
			this.Salario += aumento;
		} else {
			System.out.println("No puedes usar un dato menor o igual a 0");
		}
		
	}
	
	public void UpgradeCategory(String newRol) {
		if(!this.RolEmpresarial.equals(newRol)) {
			this.RolEmpresarial = newRol;
		} else {
			System.out.println("Este empleado ya esta en ese puesto");
		}
		
	}
	
	public void ShowInfo() {
		System.out.println("Id del Empleado: " + this.IdEmpleado);
		System.out.println("Nombre: " + this.Nombre);
		System.out.println("Rol empresarial: " + this.RolEmpresarial);
		System.out.println("Salario del empleado: " + this.Salario);
	}
	
	
}
