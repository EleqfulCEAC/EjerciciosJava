package tiendaOnline;

public interface metodosDePago {
		public abstract boolean validarPago(double cantidad);
		public abstract void procesarPago(double cantidad);
		public abstract void mostrarInfo();
		
		
}
