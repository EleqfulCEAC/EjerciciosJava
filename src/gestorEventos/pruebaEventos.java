package gestorEventos;

public class pruebaEventos {

	public static void main(String[] args) {
		Cliente C1 = new Cliente(1, "Pepe", 25.0);
		Cliente C2 = new Cliente(2, "Maria", 50.52);
		Cliente C3 = new Cliente(2, "Engels", 10.5);

		Dinamicos Event1 = new Dinamicos(87, "Aitana en concierto", GestorTypes.DINAMICO, "22:00", "2 horas", EventState.INICIADO, 45.00, DynamicTypes.CONCIERTO );
		Boolean PagoC1 = Event1.pagarEvento(C1);
		Event1.generarEntrada(PagoC1, C1);
		Boolean PagoC2 = Event1.pagarEvento(C2);
		Event1.generarEntrada(PagoC2, C2);
		Boolean PagoC3 = Event1.pagarEvento(C3);
		Event1.generarEntrada(PagoC3, C3);
		Event1.llenarAsistentes(C1, "Sin respuesta");
		Event1.llenarAsistentes(C2, "Confirmado");
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
