package todoList;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTareas {
	private List<Tarea> Tarea;

	public ListaDeTareas() {
		this.Tarea = new ArrayList<Tarea>();
	}

	public void addTarea(Tarea newTarea) {
		Tarea.add(newTarea);
		System.out.println("tarea añadida con exito");

	}

	public void deleteAll() {
		Tarea.clear();
		System.out.println("Se han eliminado todas las tareas");
	}

	public void deleteById(int ID) {
		Tarea tareaDelete = null;

		for (Tarea aux : Tarea) {
			if (aux.getID() == ID) {
				tareaDelete = aux;
				Tarea.remove(tareaDelete);
				System.out.println("Tarea Eliminada con exito");
				break;
			}
		}

		if (tareaDelete == null) {
			System.out.println("No se ha encontrado la tarea");
		}

	}

	public void changeStatus(int ID, EstadoTareas newStatus) {
		Tarea tareaStatus = null;

		for (Tarea aux : Tarea) {
			if (aux.getID() == ID) {
				tareaStatus = aux;
				break;
			}
		}

		if (tareaStatus != null) {
			tareaStatus.setStatus(newStatus);
		} else {
			System.out.println("No se ha encontrado la tarea");
		}

	}
	
	public void getAll() {
		for (Tarea aux : Tarea) {
			System.out.println("Estas son las tareas: " + aux);			
		}
		
	}
	
	public void getByCreatedDate(String Date) {
		List<Tarea> TareasInDate = new ArrayList<Tarea>(); 
		for (Tarea aux : Tarea) {
			if(aux.getF_inicio().equals(Date)) {
				TareasInDate.add(aux);
			}
			
		}
		
		if(!TareasInDate.isEmpty()) {
			for (Tarea aux : TareasInDate) {
				System.out.println("Las tareas en la fecha " + Date + " Serian: " + aux);
			}
		}
	}
	
}
	
