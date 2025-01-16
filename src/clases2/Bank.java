package clases2;

public class Bank {
	private String NumeroDeCuenta;
	private String Titular; 
	private double SaldoActual; 
	private String tipoDeCuenta;
	
	/*Constructor full*/
	
	public Bank(String numeroDeCuenta, String titular, double saldoActual, String tipoDeCuenta) {
		super();
		NumeroDeCuenta = numeroDeCuenta;
		Titular = titular;
		SaldoActual = saldoActual;
		this.tipoDeCuenta = tipoDeCuenta;
	} 
	
	/*Constructor Simple*/
	
	public Bank(String numeroDeCuenta, String titular) {
		this.NumeroDeCuenta = numeroDeCuenta;
		this.Titular = titular;
		this.SaldoActual = 0;
		this.tipoDeCuenta = "Ahorros"; 
		
	}
	
	public void Deposito(double cantidad) {
		if(cantidad > 0) {
			this.SaldoActual += cantidad; 
		} else {
			System.out.println("No se puede depositar 0 fondos");
		}
	}
	
	public void Retirar(double cantidad) {
		if(cantidad <= this.SaldoActual) {
			this.SaldoActual -=cantidad;
		} else {
			System.out.println("La cantidad que deseas retirar excede el saldo disponible");
		}
		
		
	}
	
	public void EstadoDeCuenta() {
		System.out.println("Numero de cuenta: " + this.NumeroDeCuenta);
		System.out.println("Titular: " + this.Titular);
		System.out.println("Saldo disponible: " + this.SaldoActual);
		System.out.println("Tipo de cuenta: " + this.tipoDeCuenta);
	}
	
	
}
