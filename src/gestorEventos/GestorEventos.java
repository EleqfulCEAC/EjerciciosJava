package gestorEventos;

import java.util.HashMap;

public class GestorEventos {
	protected int idEvento;
	protected String nombre;
	protected GestorTypes TypeGestor;
	protected String horaDelEvento;
	protected String duracion;
	protected EventState estadoActual;
	protected HashMap<Cliente, String> Asistentes;
	protected double costoEvento;
	

	public GestorEventos(int idEvento, String nombre, GestorTypes typeGestor, String horaDelEvento, String duracion,
			EventState estadoActual, double costo) {
		super();
		this.idEvento = idEvento;
		this.nombre = nombre;
		TypeGestor = typeGestor;
		this.horaDelEvento = horaDelEvento;
		this.duracion = duracion;
		this.estadoActual = estadoActual;
		this.Asistentes = new HashMap<>();
		this.costoEvento = costo;
	}

	public void showAsistentes() {
		for (Cliente cliente : Asistentes.keySet()) {

			Cliente Data = cliente;
			String EstadoAsistente = Asistentes.get(Data);
			System.out.println("Cliente: " + Data + " Estado : " + EstadoAsistente);
		}
	}

	public void llenarAsistentes(Cliente cliente, String Estado) {
		if(cliente.getEntrada()) {
			Asistentes.put(cliente, Estado);			
		} else {
			System.out.println("No puedes asistir, no tienes entrada validada");
		}
	}
	
	public boolean pagarEvento(Cliente cliente) {

		boolean transaccion = false;
		if(this.costoEvento < cliente.getDinero()) {
			cliente.setDinero(this.costoEvento - cliente.getDinero());			
			transaccion = true;
			return transaccion;
		} else {
			System.out.println("No tienes suficiente dinero");
		}
		return transaccion;
		
	}
	
	public void generarEntrada(boolean transaccion, Cliente cliente) {
		if(transaccion) {
			cliente.setEntrada(transaccion);
			System.out.println("Entrada generada");
		} else {
			System.out.println("No se ha completado el pago, lo siento");
		}
	}

	public void showInfo() {
		System.out.println("Id del Evento: " + this.idEvento);
		System.out.println("Nombre del Evento: " + this.nombre);
		System.out.println("Costo del evento:" + this.costoEvento);
		System.out.println("Tipo del Evento: " + this.TypeGestor);
		System.out.println("Hora del Evento: " + this.horaDelEvento);
		System.out.println("Duracion: " + this.duracion);
		System.out.println("Estado del Evento: " + this.estadoActual);

	}

}
