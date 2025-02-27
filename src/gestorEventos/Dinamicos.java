package gestorEventos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Dinamicos extends GestorEventos {

	private DynamicTypes tipoDeEvento;
	private List<String> Materiales;

	

	public Dinamicos(int idEvento, String nombre, GestorTypes typeGestor, String horaDelEvento, String duracion,
			EventState estadoActual, DynamicTypes tipoDeEvento) {
		super(idEvento, nombre, typeGestor, horaDelEvento, duracion, estadoActual);
		this.tipoDeEvento = tipoDeEvento;
		this.Materiales = new ArrayList<String>();
	}


	

	
	
	
	public void addMateriales(String Material) {
		this.Materiales.add(Material);
		
	}
	
	public void showMaterial() {
		for (String material : Materiales) {
			 	System.out.println(material);
		}
	}

}
