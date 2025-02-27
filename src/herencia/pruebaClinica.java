package herencia;

public class pruebaClinica {

	public static void main(String[] args) {
		Pacientes perro = new Pacientes(25, States.EN_PROCESO, "Animal de cuatro patas", "25-12-05", "Perro",
				"Animal sano", true);

		perro.showInfo();
		System.out.println("-------------------");

		Services paciente25 = new Services(perro.getID(), States.EN_PROCESO, "Servicios del paciente",
				LevelOfDifficult.INTERMEDIO, 60, true, "Varios");

		paciente25.addAgenda(perro);
		paciente25.changeState(perro, States.REVISADO);

		perro.showInfo();
	}

}
