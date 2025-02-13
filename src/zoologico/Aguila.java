package zoologico;

public class Aguila implements Ianimal {
		
	private String tipoDeAnimal; 
	private String tipoDeAguila; 
	private String Habitat; 
	private String Alimentacion; 
	
	

	public Aguila(String tipoDeAnimal, String tipoDeAguila, String habitat, String alimentacion) {
		super();
		this.tipoDeAnimal = tipoDeAnimal;
		this.tipoDeAguila = tipoDeAguila;
		Habitat = habitat;
		Alimentacion = alimentacion;
	}

	@Override
	public void emitirSonido() {
		System.out.println("El aguila chilla: \"ig-ig\" ");
		
	}

	@Override
	public void comer() {
		System.out.println("Alimentandose de peces pequeños y animales");
	}

	@Override
	public void dormir() {
		System.out.println("Esta mimiendo en su nido");
		
	}

	@Override
	public void moverse() {
			System.out.println("Volando por los cielos");
		
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Info del aguila:");
		System.out.println(this.Alimentacion);
		System.out.println(this.Habitat);
		System.out.println(this.tipoDeAguila);
		System.out.println(this.tipoDeAnimal);
		
	}
	
}
