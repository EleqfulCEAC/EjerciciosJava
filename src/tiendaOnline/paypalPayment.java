package tiendaOnline;

public class paypalPayment implements metodosDePago {

	  private String email; 
	  private double saldoDisponible; 
	  
	
	@Override
	public boolean validarPago(double cantidad) {
		if(cantidad < this.saldoDisponible) {
			return true;
		} else return false;
	}

	@Override
	public void procesarPago(double cantidad) {
		if(validarPago(cantidad)) {
			this.saldoDisponible =- cantidad; 
		} else {
			System.out.println("No es posible el pago");
		}
		
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Informacion del metodo de pago paypal: ");
		System.out.println("Email de la cuenta: " + this.email);
		System.out.println("Saldo disponible: " + this.saldoDisponible);
	}
		
}
