package clases2;

public class pruebasGeneral {

	public static void main(String[] args) {
		Alumno al1 = new Alumno("Juan", 18);
		Alumno al2 = new Alumno("Maria", 20);
		Alumno al3 = new Alumno("Pedro", 52);
		Alumno al4 = new Alumno("Andrea", 24);
		Alumno al5 = new Alumno("Sakura", 20);
		
		
		Aula DAW =  new Aula(1, "DAW1", 23);
		
		DAW.addAlumno(al1);
		DAW.addAlumno(al2);
		DAW.addAlumno(al3);
		DAW.addAlumno(al4);
		DAW.addAlumno(al5);
		
		DAW.showInfo();
		
		
	
	}

}
