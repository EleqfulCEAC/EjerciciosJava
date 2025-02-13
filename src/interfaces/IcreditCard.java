package interfaces;

public interface IcreditCard {
	
		public final double conversorEuroDolar = 1.1;
	
		public double sacarDinero ();
		
		public void ingresarDinero (double cantidad); 
		
		public default void calcularDinero() {
			System.out.println("Tu dinero es...");
		}
		
		
		
		
}
