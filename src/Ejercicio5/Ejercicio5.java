package Ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) { 
		// Un número es múltiplo de otro cuando es divisible por ese número sin dejar resto. 
		// En otras palabras, si se divide el primer número entre el segundo y el resultado es un número entero (sin decimales), 
		// entonces el primer número es múltiplo del segundo.
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Este programa recibe dos numeros y compara si ambos son multiplos");
		
		System.out.println("Introduce el primer numero");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero");
		int num2 = sc.nextInt();
		
		if(num1 % num2 == 0 ) {
			System.out.println("Los numeros " + num1 + " y el " + num2 + " son multiplos de si mismos");
		} else {
			System.out.println("Ambos numeros no son multiplos de si mismos");
		}
		
		
		
	}
}
