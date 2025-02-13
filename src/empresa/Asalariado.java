package empresa;

public class Asalariado implements empleado {
		private String nombre; 
		private int ID; 
		private double salarioMensual; 
		
	
		public Asalariado(String nombre, int iD, double salarioMensual) {
			super();
			this.nombre = nombre;
			ID = iD;
			this.salarioMensual = salarioMensual;
		}

		@Override
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
			double salario = this.salarioMensual;
			return salario;
		}

		@Override
		public void mostrarInfo() {
			System.out.println("Info del asalariado: ");
			System.out.println("Nombre " + obtenerNombre());
			System.out.println("ID: " + obtenerID());
			System.out.println("Salario " + calculoDeSalario());
			
		}
}
