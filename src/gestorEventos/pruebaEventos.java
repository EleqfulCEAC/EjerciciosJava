package gestorEventos;

public class pruebaEventos {

	public static void main(String[] args) {
		Cliente C1 = new Cliente(1, "Pepe");
		Cliente C2 = new Cliente(2, "Maria");
		Cliente C3 = new Cliente(2, "Engels");

		Dinamicos Event1 = new Dinamicos(1, "Metalica en madrid", GestorTypes.DINAMICO, "19:00", "2 horas",
				EventState.INICIADO, DynamicTypes.CONCIERTO);

		Event1.llenarAsistentes(C1, "Confirmado");
		Event1.llenarAsistentes(C2, "Sin respuesta");
		Event1.llenarAsistentes(C3, "No viene");
		Event1.showInfo();
		Event1.showAsistentes();
		Event1.addMateriales("Altavoces");
		Event1.addMateriales("Suelo de pista");
		Event1.addMateriales("luces");
		System.out.println("Los materiales del evento son: ");
		Event1.showMaterial();
		

	}

}
