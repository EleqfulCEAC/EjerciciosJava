package restaurante;

public class salaDelRestaurante {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Café", 4.5);
		Producto producto2 = new Producto("Té", 3.0);
		Producto producto3 = new Producto("Chocolate", 2.5);
		Producto producto4 = new Producto("Leche", 1.5);
		Producto producto5 = new Producto("Pan", 1.2);
		Producto producto6 = new Producto("Queso", 5.0);
		Producto producto7 = new Producto("Jamón", 6.0);
		Producto producto8 = new Producto("Manzana", 0.8);
		Producto producto9 = new Producto("Naranja", 1.0);
		Producto producto10 = new Producto("Yogur", 2.0);
		
		consumirRestaurante pedido1 = new consumirRestaurante();
		
		pedido1.agregarPedido(producto1);
		pedido1.agregarPedido(producto2);
		pedido1.agregarPedido(producto3);
		pedido1.agregarPedido(producto4);
		pedido1.agregarPedido(producto5);
		pedido1.agregarPedido(producto6);
		pedido1.agregarPedido(producto7);
		pedido1.agregarPedido(producto8);
		pedido1.agregarPedido(producto9);
		pedido1.agregarPedido(producto10);
		
		System.out.println("total del coste del pedido: " + pedido1.calcularTotal());
		
		pedido1.mostrarPedido();
		
		
		
		

	}

}
