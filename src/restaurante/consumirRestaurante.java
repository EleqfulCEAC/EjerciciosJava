package restaurante;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class consumirRestaurante implements Pedido {
	private List<Producto> productos;
	private Estados EstadoPedido;
	private final int Impuesto = 10;

	public consumirRestaurante() {

		this.productos = new ArrayList<>();
		EstadoPedido = Estados.PENDIENTE;
	}

	@Override
	public void agregarPedido(Producto miProducto) {
		productos.add(miProducto);

	}

	@Override
	public double calcularTotal() {

		double precio = 0;

		for (Producto producto : productos) {
			precio += producto.getPrecio();
		}

		double impuestoTotal = precio * Impuesto / 100;

		double total = impuestoTotal + precio;

		return total;
	}

	@Override
	public void procesarPedido() {
		this.EstadoPedido = Estados.EN_PREPARACION;

	}

	@Override
	public void mostrarPedido() {
		System.out.println("Este es el pedido: ");
		System.out.println("Productos: ");
		for (Producto producto : productos) {
			System.out.println(producto.getName());
			System.out.println(producto.getPrecio());
		}
		System.out.println("Estado del pedido: ");
		System.out.println(this.EstadoPedido);
	}

}
