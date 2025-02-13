package zoologico;

public class visitaAlZoologico {

	public static void main(String[] args) {
		Leon simba = new Leon("Mamifero", "Sabana", "Otros Mamiferos y humanos", "Amarillo");

		Aguila Falcon = new Aguila("Ave", "Calva", "Los cielos de USA", "Carnivora");

		System.out.println("Vamos a ver a los Leones");
		simba.mostrarInfo();
		simba.emitirSonido();
		simba.comer();
		simba.dormir();
		simba.emitirSonido();
		simba.moverse();

		System.out.println("---------------------------------------------");

		System.out.println("Ahora vamos a ver a las Aguilas");
		Falcon.mostrarInfo();
		Falcon.emitirSonido();
		Falcon.comer();
		Falcon.dormir();
		Falcon.moverse();
	}

}
