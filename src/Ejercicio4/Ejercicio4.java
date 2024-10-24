package Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		System.out.println("Este programa recibe dos numeros y compara si ambos son iguales");
		
		System.out.println("Introduce el primer numero");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Si los numeros " + num1 + " y el " + num2 + " son iguales");
		} else {
			System.out.println("Lo siento, los numeros " + num1  + " y el " + num2 + " no son iguales");
			
		}
		
		

	}

}
