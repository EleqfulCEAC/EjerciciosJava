package todoList;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String username; 
	private ListaDeTareas misTareas;
	
	public Usuario(String username) {
		super();
		this.username = username;
		misTareas = new ListaDeTareas();
	}


	

	public void setMisTareas(ListaDeTareas misTareas) {
		this.misTareas = misTareas;
	}
	
	public void addTarea(Tarea newTarea) {
		misTareas.addTarea(newTarea);
	}


	public void deleteAll() {
		misTareas.deleteAll();
	}

	public void deleteById(int ID) {
		misTareas.deleteById(ID); }
	

	public void changeStatus(int ID, EstadoTareas newStatus) {
		misTareas.changeStatus(ID, newStatus);}
	
	
	public void getAll() {
		misTareas.getAll();   }


	public void getByCreatedDate(String Date) {
		misTareas.getByCreatedDate(Date);
	}
	
	
	
	

}
