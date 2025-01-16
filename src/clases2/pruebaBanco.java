package clases2;

public class pruebaBanco {

	public static void main(String[] args) {
		Bank c1 = new Bank("A1289-12345-98780-34333", "kirito-kun");
		c1.EstadoDeCuenta();
		c1.Deposito(150000);
		c1.EstadoDeCuenta();
		c1.Retirar(150000);
		c1.EstadoDeCuenta();

	}

}
