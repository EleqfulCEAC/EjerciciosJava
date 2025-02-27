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

	public GestorEventos(int idEvento, String nombre, GestorTypes typeGestor, String horaDelEvento, String duracion,
			EventState estadoActual) {
		super();
		this.idEvento = idEvento;
		this.nombre = nombre;
		TypeGestor = typeGestor;
		this.horaDelEvento = horaDelEvento;
		this.duracion = duracion;
		this.estadoActual = estadoActual;
		this.Asistentes = new HashMap<>();
	}

	public void showAsistentes() {
		for (Cliente cliente : Asistentes.keySet()) {

			Cliente Data = cliente;
			String EstadoAsistente = Asistentes.get(Data);
			System.out.println("Cliente: " + Data + " Estado : " + EstadoAsistente);
		}
	}

	public void llenarAsistentes(Cliente cliente, String Estado) {
		Asistentes.put(cliente, Estado);
	}

	public void showInfo() {
		System.out.println("Id del Evento: " + this.idEvento);
		System.out.println("Nombre del Evento: " + this.nombre);
		System.out.println("Tipo del Evento: " + this.TypeGestor);
		System.out.println("Hora del Evento: " + this.horaDelEvento);
		System.out.println("Duracion: " + this.duracion);
		System.out.println("Estado del Evento: " + this.estadoActual);

	}

}
