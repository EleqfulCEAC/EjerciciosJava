package Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		AreaDelCirculo(5);

	}
	
	public static void AreaDelCirculo(int Radio) {
		
		double pi = Math.PI;
		double RadioAlCuadrado = Radio * Radio;
		double Area = pi * RadioAlCuadrado;
		System.out.println(Area);
		
	}

}
