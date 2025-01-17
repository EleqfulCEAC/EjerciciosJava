package clases2;

import java.util.ArrayList;

public class Aula {
	
	/*IMPLEMENTAR GET Y SETTER*/
	
		private int id; 
		private String nombre; 
		private int NumeroDeClase; 
		private ArrayList ListaDeAlumnos;
		
		
		public Aula(int id, String nombre, int numeroDeClase) {
			super();
			this.id = id;
			this.nombre = nombre;
			NumeroDeClase = numeroDeClase;
			this.ListaDeAlumnos = this.ListaDeAlumnos = new ArrayList<Alumno>();
		}
		
		
		public void addAlumno(Alumno NewAlumno) {
			this.ListaDeAlumnos.add(NewAlumno);
		}
		
		public void showInfo() {
			System.out.println("Lista de clase: " + this.ListaDeAlumnos);
		}
		
		
		
		
}


