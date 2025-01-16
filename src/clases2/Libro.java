package clases2;

public class Libro {
	private String titulo; 
	private String Autor; 
	private int Paginas; 
	private String Estado = "Disponible";
	private int paginaActual = 1; 
	private int paginaGuardada;
	
	
	public Libro(String titulo, String autor, int paginas, String estado) {
		super();
		this.titulo = titulo;
		Autor = autor;
		if(paginas <= 0) {
			System.out.println("No se puede iniciar un libro con 0 paginas");
			Paginas = 1;
		} else {
			Paginas = paginas;			
		}
		Estado = estado;
		
	} 
	
	public void UseLibro(String accion) {
		if(accion.equals("solicitar")) {
			this.Estado = "prestado";
		}
		
		if(accion.equals("devolver")) {
			this.Estado = "Disponble"; 
			
		}
	
	}
	
	public void Leer(int paginasLeer) {
		if(paginasLeer <= 0) {
			System.out.println("No puedes leer 0 paginas");
		} if (paginasLeer <= Paginas) {
			System.out.println("Leyendo...");
			this.paginaActual += paginasLeer;			
		} else {
			System.out.println("No puedes leer paginas que no existe");
		}
	}
	
	public void MarcarPagina(){
		if(paginaActual <= Paginas) {
			int paginaGuardada = this.paginaActual;			
			System.out.println("Se ha guardado la pagina actual");
		} else {
			System.out.println("No puedes guardar una pagina que no existe");
		}
	}
	
	
	public void LibroInfo() {
		System.out.println("titulo: " + this.titulo);
		System.out.println("Autor: " + this.Autor);
		System.out.println("Numero de Paginas: " + this.Paginas);
		System.out.println("Estado del libro: " + this.Estado);
		System.out.println("Pagina guardada: " + this.paginaGuardada);
		System.out.println("Pagina actual: " + this.paginaActual);
	}
	
	
}
