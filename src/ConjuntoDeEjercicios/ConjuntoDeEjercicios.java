package ConjuntoDeEjercicios;
import java.util.Scanner;

public class ConjuntoDeEjercicios {

	public static void main(String[] args) {
		System.out.println("Este programa puede realizar varias operaciones segun el numero de operacion que desees realizar:");
		System.out.println("Opcion 1: Calcular si un numero es multiplo de otro");
		System.out.println("Opcion 2: Comprobar en dos numeros cual es mayor que el otro");
		System.out.println("Opcion 3: Obtener el numero mayor ");
		
		int NumDeOperacion = inputOfNumbers();
		
		switch ( NumDeOperacion) {
			
		case 1: {
			Mutiplos();
		}
		
		case 2: {
			NumMayor();
		}
		
		case 3:{
			WhoIsTheMaxNumber();
		}
		
		
		
		}

	}
	
	
	
	//Funciones segun cada caso: 
	
	//Calculo de multiplos 
	public static void Mutiplos() {
		
		MessageOfNum1();
		int num1 = inputOfNumbers();
		
		MessageOfNum2();
		int num2 = inputOfNumbers();
		
		if(num1 % num2 == 0 ) {
			System.out.println("Los numeros " + num1 + " y el " + num2 + " son multiplos de si mismos");
		} else {
			System.out.println("Ambos numeros no son multiplos de si mismos");
		}
	}
	
	public static void NumMayor() {
		MessageOfNum1();
		int num1 = inputOfNumbers();
		
		MessageOfNum2();
		int num2 = inputOfNumbers();
		
		if(num1 > num2) {
			
			System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
		} else {
			System.out.println("El numero " + num1 + " no es mayor que el numero " + num2);

		}
		
		
	}
	
	public static void WhoIsTheMaxNumber() {
		MessageOfNum1();
		int num1 = inputOfNumbers();
		
		MessageOfNum2();
		int num2 = inputOfNumbers();
		
		if (num1 > num2) {
			System.out.println("El numero mayor es: " + num1);
		} else {
			System.out.println("El numero mayor es: " + num2);
		}
		
		
	}
	
	
	
	//Global functions 
	
	public static int inputOfNumbers() {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Introduce a continuacion el numero");
		int num = sc.nextInt();
		
		return num;
		
	}
	
	public static void MessageOfNum1() {
		System.out.println("Introduce el primer numero");
	}
	
	public static void MessageOfNum2() {
		System.out.println("Introduce el Segundo numero");
	}

}
