package Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 3. Pedir el radio de una circunferencia y calcular su longitud.  L=2*PI*r. 
		Scanner radioFromInput = new Scanner (System.in); 
		System.out.println("Introduce el valor del radio que tendra la circunferencia8");
		int radio = radioFromInput.nextInt();
		LongitudCircunferencia(radio);
		
		

	}
	
	public static void LongitudCircunferencia (int radio) {
		double pi = Math.PI;
		double LongitudDeCircunferencia = 2 * pi * radio;
		System.out.println( LongitudDeCircunferencia );
	}

}
