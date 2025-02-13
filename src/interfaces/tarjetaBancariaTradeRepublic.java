package interfaces;

public class tarjetaBancariaTradeRepublic implements IcreditCard {

	@Override
	public double sacarDinero() {
		System.out.println("Estas en tradeRepublic... sacando dinero...");
		return 0;
	}

	@Override
	public void ingresarDinero(double cantidad) {
		System.out.println("Estas en tradeRepublic... Haz Ingresado: " + cantidad);
		
	}

	

}
