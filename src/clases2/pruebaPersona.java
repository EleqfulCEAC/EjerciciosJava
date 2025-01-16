package clases2;

public class pruebaPersona {

	public static void main(String[] args) {
		Persona p1;
		try {
			p1 = new Persona("PEDRO", 18, 1.70, 60, false);			
			p1.IMC();
			p1.MostrarInfo();
			p1.favoriteAnime();
			p1.train();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
	}

}
