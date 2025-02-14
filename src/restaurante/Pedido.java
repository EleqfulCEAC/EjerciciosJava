package restaurante;

public interface Pedido {

	public abstract void agregarPedido(Producto miProducto);
	
	public abstract double calcularTotal(); 
	
	public abstract void procesarPedido(); 
	
	public abstract void mostrarPedido();
	
	
}
