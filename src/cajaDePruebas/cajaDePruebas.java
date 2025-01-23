package cajaDePruebas;

import ejerciciosClases2.ejercicio1.Curso;
import ejerciciosClases2.ejercicio1.Estudiante;

public class cajaDePruebas {

	public static void main(String[] args) {
		Curso DAW = new Curso("DAW1");
		
		Estudiante E1 = new Estudiante(20, "Pedro", 0);
        Estudiante E2 = new Estudiante(21, "Ana", 5);
        Estudiante E3 = new Estudiante(22, "Luis", 9);
        Estudiante E4 = new Estudiante(23, "Marta", 7);
        Estudiante E5 = new Estudiante(24, "Carlos", 6);
        
        DAW.addStudent(E1);
        DAW.addStudent(E2);
        DAW.addStudent(E3);
        DAW.addStudent(E4);
        DAW.addStudent(E5);
        
       DAW.showAllStudent();

	}

}
