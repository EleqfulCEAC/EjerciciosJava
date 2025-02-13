package zoologico;

public class Leon implements Ianimal{
	
	private String tipoDeAnimal; 
	private String Habitat; 
	private String Alimentacion; 
	private String Color; 
	
	
	
	

	public Leon(String tipoDeAnimal, String habitat, String alimentacion, String color) {
		super();
		this.tipoDeAnimal = tipoDeAnimal;
		Habitat = habitat;
		Alimentacion = alimentacion;
		Color = color;
	}

	@Override
	public void emitirSonido() {
		System.out.println("El leon ruge: RAUUUUWWWW");
		
	}

	@Override
	public void comer() {
		System.out.println("El leon comiendo carne");
		
	}

	@Override
	public void dormir() {
		System.out.println("El leon esta mimido bajo la sombra");
		
	}

	@Override
	public void moverse() {
		System.out.println("El leon corre o camina");
		
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Informacion del Leon: ");
		System.out.println(this.tipoDeAnimal);
		System.out.println(this.Habitat);
		System.out.println(this.Color);
		System.out.println(this.Alimentacion);

		
		
	}
	
}
