package restaurante;

import java.util.ArrayList;
import java.util.List;

public class pedidoLlevar implements Pedido {

	private List <Producto> productos; 
	private Estados EstadoPedido;
	
	public pedidoLlevar() {
		super();
		this.productos = new ArrayList<>();
		EstadoPedido = Estados.PENDIENTE;
	}
	
	@Override
	public void agregarPedido(Producto miProducto) {
		productos.add(miProducto);
		
	}


	@Override
	public double calcularTotal() {
		
			
			double precio= 0;
			
			for (Producto producto : productos) {
				precio =+ producto.getPrecio();
			}
			
			double total = precio;
			
			return total; 
		
	}

	@Override
	public void procesarPedido() {
		this.EstadoPedido = Estados.EMPAQUETADO;
		
	}

	@Override
	public void mostrarPedido() {
		System.out.println("Este es el pedido: ");
		System.out.println("Productos: ");
		for (Producto producto : productos) {
				System.out.println(producto);
		}
		System.out.println("Estado del pedido: ");
		System.out.println(this.EstadoPedido);
		
	}


}
