package empresa;

public class diaDeCobranza {

	public static void main(String[] args) {
		Asalariado asalariado1 = new Asalariado("Pedirto", 256, 1500.00);
		ePorHoras porHoras1 = new ePorHoras("Maria", 587, 30.5, 150); 
		
		System.out.println("Vamos a ver los datos del Asalariado: ");
		asalariado1.mostrarInfo();
		System.out.println("-------------------------------");
		System.out.println("Vamos a ver los datos del Empleado por horas");
		porHoras1.mostrarInfo();

	}

}
