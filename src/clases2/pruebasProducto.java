package clases2;

public class pruebasProducto {

	public static void main(String[] args) {
			Producto p1 = new Producto(1, "Arroz");
			Producto p2 = new Producto(2, "Agua", -1000, 500);
			Producto p3 = new Producto(3, "Thungsteno", 1000, 500);
			p3.Descuento(30);
			p3.ShowInfo();
			p3.AddUnits(2000);
			p3.BuyUnit(2400);
	}

}
