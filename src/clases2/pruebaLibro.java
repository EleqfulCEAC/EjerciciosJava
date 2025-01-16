package clases2;

public class pruebaLibro {

	public static void main(String[] args) {
		Libro L1 = new Libro("Java Manual","Pedro Perez", 250, "disponible");
		
		L1.LibroInfo();
		L1.UseLibro("solicitar");
		L1.Leer(5);
		L1.MarcarPagina();
		L1.LibroInfo();
		L1.Leer(1);
		L1.LibroInfo();
		

	}

}
