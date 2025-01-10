package clases2;

/**
 * 
 * 
 * 
 * 
 * 
 * 
 * */



public class Producto {
		private int Id; 
		private String Nombre;
		private double PrecioPorUnidad;
		private int Stock; 
		
		public Producto(int Id, String Nombre) {
			this.Id=Id;
			this.Nombre=Nombre; 
			this.Stock=0;
			this.PrecioPorUnidad=1;
			
			
		}
	/**
	* 
	* 
	* 
	* 
	* 
	* 
	* */		
		
		
		public Producto(int id, String nombre, double precioPorUnidad, int cantidad) {
			super();
			Id = id;
			Nombre = nombre;
			if(precioPorUnidad > 0) {
				 PrecioPorUnidad = precioPorUnidad; 
			} else {
				PrecioPorUnidad = 1;
			}
			if(cantidad > 0) {
				Stock = cantidad;
			} else {
				Stock = 0;
			}
			PrecioPorUnidad = precioPorUnidad;
			Stock = cantidad;
		}
		
		public void Descuento(double descuento) {
			if(descuento>= 0 && descuento <100) {
				this.PrecioPorUnidad -= this.PrecioPorUnidad*descuento /100.00;
			}
			
		}
		
		public void AddUnits(int UnitToADD) {
			if(UnitToADD >= 0) {
				this.Stock += UnitToADD;				
			}
			
		}
		
		public void ShowInfo() {
			System.out.println("Id del producto: " + this.Id);
			System.out.println("Nombre: " + this.Nombre);
			System.out.println("Stock Disponible: " + this.Stock);
			System.out.println("Precio por  unidad: " + this.PrecioPorUnidad);
		}
		
		public void BuyUnit(int Cantidad) {
			if(Cantidad >= Stock ) {
				System.out.println("no se puede comprar mas del inventario");
			} 
			
			Stock -= Cantidad; 
			System.out.println("Haz comprado: " + Cantidad + " unidades" + " quedan actualmente: " + Stock);
		}
		
}
