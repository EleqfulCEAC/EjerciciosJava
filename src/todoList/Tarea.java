package todoList;

public class Tarea {
	private int ID; 
	private String f_inicio; 
	private String Mensaje; 
	private EstadoTareas Status; 
	private String FechaProgramada;
	
	
	public String getF_inicio() {
		return f_inicio;
	}


	public Tarea(int iD, String f_inicio, String mensaje, EstadoTareas status, String fechaProgramada) {
		super();
		ID = iD;
		this.f_inicio = f_inicio;
		Mensaje = mensaje;
		Status = status;
		FechaProgramada = fechaProgramada;
	}


	public int getID() {
		return ID;
	}


	public EstadoTareas getStatus() {
		return Status;
	}


	public void setStatus(EstadoTareas status) {
		Status = status;
	} 
	
	
	
	
	
	
	
	

}
