package tiendaOnline;

public class creditCardPayment implements metodosDePago {
	private String numeroTarjeta; 
	private double limiteDisponible;
	
	
	
	
	
	public creditCardPayment(String numeroTarjeta, double limiteDisponible) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.limiteDisponible = limiteDisponible;
	}
	@Override
	public boolean validarPago(double cantidad) {
			if(cantidad < this.limiteDisponible) {
				return true;
			} else return false;
	
	}
	@Override
	public void procesarPago(double cantidad) {
		if(validarPago(cantidad)) {
			this.limiteDisponible =- cantidad; 
			System.out.println("El restante es: " + this.limiteDisponible);
		}
		
	}
	@Override
	public void mostrarInfo() {
		System.out.println("Datos del metodo de pago: ");
		System.out.println("Numero de la tarjeta: " + numeroTarjeta);
		System.out.println("Limite actual de la tarjeta: " + limiteDisponible);
		
	} 
	
	
}
