package gestorEventos;

public class Estaticos extends GestorEventos {
		
	private staticTypes tipoDeEvento;

	public Estaticos(int idEvento, String nombre, GestorTypes typeGestor, String horaDelEvento, String duracion,
			EventState estadoActual, staticTypes tipoDeEvento) {
		super(idEvento, nombre, typeGestor, horaDelEvento, duracion, estadoActual);
		this.tipoDeEvento = tipoDeEvento;
	}
	
	
	
	
	
	
	

}
