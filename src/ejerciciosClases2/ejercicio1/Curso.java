package ejerciciosClases2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String NombreCurso;
	private List<Estudiante> Estudiantes;

	public Curso(String nombreCurso) {
		super();
		NombreCurso = nombreCurso;
		List<Estudiante> estudiantes = new ArrayList<>();
		Estudiantes = estudiantes;
	}

	public void addStudent(Estudiante newStudent) {
		int newStudentID = newStudent.getID();

		for (Estudiante AuxStudent : Estudiantes) {
			if ((AuxStudent.getID() != newStudentID)) {
				Estudiantes.add(newStudent);
			} else {
				System.err.println("Este estudiante ya ha sido añadido");
			}
		}
	}

	public void deleteStudent(Estudiante student) {
		Estudiantes.remove(student);
		if(!Estudiantes.remove(student)){
			System.err.println("Este estudiante no existe, por lo tanto no se puede eliminar");
		}

	}
	
	public void searchStudent(Estudiante student) {
		int studentToSearch = student.getID();
		
		for (Estudiante AuxStudent : Estudiantes) {
			int studentID = AuxStudent.getID();
			if(studentID == studentToSearch) {
				student.showInfo();
			}
	}
		
	}
	
	
	public void showAllStudent() {
		for (Estudiante allStudents : Estudiantes) {
			System.out.println(allStudents);
			allStudents.showInfo();
		}
	}
	
	public int findAverage() {
		int counter = 0;
		 int totalCalificacion = 0;
		for (Estudiante student : Estudiantes) {
			int calificacion = student.getCalificacion();
			counter++;
			 totalCalificacion = totalCalificacion + calificacion;
		}
		
		int averageCalificacion = totalCalificacion / counter;
		return averageCalificacion;
		
		
	}
	
	public void listBestStudents(int bestCalificacion) {
		List <Estudiante> bestStudents = new ArrayList<Estudiante>(); 
		for (Estudiante auxListEstudiante : Estudiantes) {
			   int calificacion = auxListEstudiante.getCalificacion();
			   if(calificacion >= bestCalificacion) {
				   bestStudents.add(auxListEstudiante);
			   }
			   
		}
		
		System.out.println("Estos son los mejores estudiantes: " + bestStudents);
	}
	
	
	public void deleteAllStudents() {
		Estudiantes.clear();
	}
	
	
}
