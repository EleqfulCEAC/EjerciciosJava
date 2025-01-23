package ejerciciosClases2.ejercicio1;

public class Estudiante {
	private int ID; 
	private String Nombre; 
	private int Calificacion;
	
	
	public Estudiante(int iD, String nombre, int calificacion) {
		super();
		ID = iD;
		Nombre = nombre;
		Calificacion = calificacion;
	} 
	

	
	public void updateCalificacion(int newCalificacion) throws Exception {
		if(!(newCalificacion > 10) && !(newCalificacion < 0) ) {
			this.Calificacion = newCalificacion;
		} else { 
			System.err.println("La nota no puede ser mayor a 10 ni menor a 0, intente de nuevo");
		}
	}
	
	public void showInfo() {
		
		System.out.println("Id del estudiante: " + this.ID);
		System.out.println("Nombre del estudiante: " + this.Nombre);
		System.out.println("Calificacion: " + this.Calificacion);
		
	}
	
	public void compareCalificacion(Estudiante student) {
		
		int calificacionToCompare = student.getCalificacion();
		String NameFromCompare = student.getNombre();
		
		if(this.Calificacion > calificacionToCompare) {
			System.out.println("La calificacion de: " + this.Nombre + "Es mayor a la calificacion de: " + NameFromCompare);
		} else {
			System.out.println("La calificacion de: " + NameFromCompare + "Es mayor a la calificacion de: " +  this.Nombre);
		} 
		
		if(this.Calificacion == calificacionToCompare) {
			System.out.println("Ambas calificaciones son iguales");
		}
	}
	
	
	public boolean validateStudentID(int ID) {

		if(this.ID == ID) {
			return true; 
		} else {
			return false;
		}
	}
	
	
	



	public int getID() {
		return ID;
	}

	public String getNombre() {
		return Nombre;
	}

	public int getCalificacion() {
		return Calificacion;
	}
	
	
}




