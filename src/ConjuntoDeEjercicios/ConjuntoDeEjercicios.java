package ConjuntoDeEjercicios;
import java.util.Scanner;

public class ConjuntoDeEjercicios {

	public static void main(String[] args) {
		System.out.println("Este programa puede realizar varias operaciones segun el numero de operacion que desees realizar:");
		System.out.println("Opcion 1: Calcular si un numero es multiplo de otro");
		System.out.println("Opcion 2: Comprobar en dos numeros cual es mayor que el otro");
		System.out.println("Opcion 3: Obtener el numero mayor ");
		System.out.println("Opcion 4: Comprobando si es un numero positivo o negativo" );
		System.out.println("Opcion 5: Ordenando dos numeros de mayor a menor" );
		System.out.println("Opcion 6: ordenando tres numeros de mayor a menor" );
		System.out.println("Opcion 7: introduce un numero y te dire cue" );
		System.out.println("Opcion 8: puntuacion por rangos" );
		System.out.println("Opcion 9: Obten la suma total de 10 numeros" );
		
		
		
		
		int NumDeOperacion = inputOfNumbers();
		
		switch ( NumDeOperacion) {
			
		case 1: {
			Mutiplos();
			break;
		}
		
		case 2: {
			NumMayor();
			break;
		}
		
		case 3:{
			WhoIsTheMaxNumber();
			break;
		}
		case 4:{
			isPositiveOrNot();
			break;
		} 
		case 5: {
			orderNumbers();
			break;
		} 
		case 6: {
			order3Numbers();
			break;
		}
		case 7: {
			howChartsHasThisNumber();
			break;
		} 
		case 8:{
			pointScale();
		}
		case 9:{
			totalOfTenNumbers();
			
		}
		
		
		
		}

	}
	
	
	
	//Funciones segun cada caso: 
	
	// Obtener numero mayor:
	
	//Calculo de multiplos 
	public static void Mutiplos() {
		
		String Order = InputOfOrder();
		MessageOfNum(Order);
		int num1 = inputOfNumbers();
		
		String Order2 = InputOfOrder();
		MessageOfNum(Order2);
		int num2 = inputOfNumbers();
		
		if(num1 % num2 == 0 ) {
			System.out.println("Los numeros " + num1 + " y el " + num2 + " son multiplos de si mismos");
		} else {
			System.out.println("Ambos numeros no son multiplos de si mismos");
		}
	}
	
	public static void NumMayor() { 
		

		String Order = InputOfOrder();
		MessageOfNum(Order);
		int num1 = inputOfNumbers();
		
		String Order2 = InputOfOrder();
		MessageOfNum(Order2);
		int num2 = inputOfNumbers();
		
		if(num1 > num2) {
			
			System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
		} else {
			System.out.println("El numero " + num1 + " no es mayor que el numero " + num2);

		}
		
		
	}
	
	
	// Devuelve el numero mayor
	public static void WhoIsTheMaxNumber() {
		String Order = InputOfOrder();
		MessageOfNum(Order);
		int num1 = inputOfNumbers();
		
		String Order2 = InputOfOrder();
		MessageOfNum(Order2);
		int num2 = inputOfNumbers();
		
		if (num1 > num2) {
			System.out.println("El numero mayor es: " + num1);
			
		} else if (num1 == num2) {
			System.out.println("ambos numeros son iguales");
		}
			
		else {
			System.out.println("El numero mayor es: " + num2);
		}
		
		
	} 
	
	
	// Indica si el numero es positivo 
	public static void isPositiveOrNot() {
		String Order = InputOfOrder();
		MessageOfNum(Order);
		int num = inputOfNumbers();
		
		if (num > 0 ) {
			System.out.println("is positive");
		} else {
			System.out.println("is negative");
		
		}
	
		
		
		
	}
	
	
	// Ordena numeros de mayor a menor
	public static void orderNumbers() {
		
		String Order = InputOfOrder();
		MessageOfNum(Order);
		int num1 = inputOfNumbers();
		
		String Order2 = InputOfOrder();
		MessageOfNum(Order2);
		int num2 = inputOfNumbers();
		
		if (num1 > num2) {
			System.out.println("los numeros que haz dado en orden mayor son: " + num1 + ", " + num2);
		} 
		else {
			System.out.println("los numeros que haz dado en orden mayor son: " + num2 + ", " + num1);
		}
		
	}
	
	
	// Ordena 3 numeros de mayor a menor 
	public static void order3Numbers() {
		
		String Order = InputOfOrder();
		MessageOfNum(Order);
		int num1 = inputOfNumbers();
		
		String Order2 = InputOfOrder();
		MessageOfNum(Order2);
		int num2 = inputOfNumbers();
		
		String Order3 = InputOfOrder();
		MessageOfNum(Order3);
		int num3 = inputOfNumbers();		
		
		if (num1 > num2 && num1 > num3) {
			Boolean NumFlag = true; 
			 	if (NumFlag && num2 > num3) {
			 		System.out.println("los numeros que haz dado en orden mayor son: " + num1 + ", " + num2 + "," + num3);
			 	} else {
			 		System.out.println("los numeros que haz dado en orden mayor son: " + num1 + ", " + num3 + "," + num2);
			 	}
		}  
			else if (num2 > num1 && num2 > num3) {
				Boolean NumFlag = true; 
			 	if (NumFlag && num1 > num3) {
			 		System.out.println("los numeros que haz dado en orden mayor son: " + num2 + ", " + num1 + "," + num3);
			 	} else {
			 		System.out.println("los numeros que haz dado en orden mayor son: " + num2 + ", " + num3 + "," + num1);
			 	} 
		} else {
			if (num1 > num2) {
				System.out.println("los numeros que haz dado en orden mayor son: " + num3 + ", " + num1 + "," + num2);
			} else {
				System.out.println("los numeros que haz dado en orden mayor son: " + num3 + ", " + num2 + "," + num1);
				
			}
			
		}
		
		
	}
	
	
	// indica el numero de cifras que tiene un numero
	public static void howChartsHasThisNumber() {

		String Order = InputOfOrder();
		MessageOfNum(Order);
		System.out.println("El numero tiene que ser entre 0 y 9.999");
		int num = inputOfNumbers(); 
		String number = String.valueOf(num);
		int counter = number.length(); 
		String ReversedNumber = "";
		char sortedNumber = ' ';
		
		System.out.println("El numero que haz introducido tiene " + counter + " cifras" );
		
		System.out.println("Deseas mostrarlo con las cifras al reves?");
		boolean flag = BooleanInput();
		
		
		if(flag) {
			
			for (int i = number.length(); i > 0; i--) {
				 sortedNumber = number.charAt(i -1);
				System.out.print(sortedNumber);
				flag = !flag;
				
			}
			
			System.out.println("Deseas ver si es capicua con las cifras al reves?");
			flag = BooleanInput();
			
			if(flag) {
			
			for (int j = number.length(); j > 0; j--) {
				char numero = sortedNumber;
				
				String totalNumber = String.valueOf(numero);
				
				ReversedNumber = ReversedNumber + totalNumber;
				
				System.out.println("El numero a comparar es:" + ReversedNumber);
				
				
			}
			
			}
			
		} 
		
		
		
		
		
	}
	
	
	public static void pointScale() {
		System.out.println("Introduce la puntuacion del 1-10 que crees que tienes en desarrollo de java");
		int points = inputOfNumbers();
		
		if (points >= 0 && points < 2) { System.out.println("Puntuacion insuficiente");}
		if (points >= 2 && points < 4) { System.out.println("Puntuacion regular");}
		if (points >= 4 && points < 6) { System.out.println("Buena puntuacion, pero mejorable");}
		if (points >= 6 && points < 8) { System.out.println("Puntuacion bastante buena");}
		if (points >= 8 && points <= 10) { System.out.println("Excelente puntuacion");}
		

			
		
		
	}
	
	public static void totalOfTenNumbers() {
		System.out.println("Esta opcion te pedira que introduzcas 10 numeros enteros y te devolvera la suma total de los 10 numeros");
		
		int finalNumber = 0;
		
		for (int i = 0; i < 10; i++) {
			int num = inputOfNumbers();
			
			int totalNumber = num;
			
			finalNumber = finalNumber + totalNumber;
			
			
			
		}
		
		System.out.println(finalNumber);
	
		
		
		
	}
	//Global functions 
	
	
	public static int inputOfNumbers() {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Introduce a continuacion el numero");
		int num = sc.nextInt();
		
		return num;
		
	}
	
	public static void MessageOfNum(String Order) {
		System.out.println("Introduce el " + Order + " numero");
	}
	
	public static double inputOfDouble() {
		Scanner sc = new Scanner (System.in); 
		System.out.println("Introduce a continuacion el numero");
		double num = sc.nextDouble();
		
		return num;
		
	}
	
	public static boolean BooleanInput() {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Elige true o false");
		boolean flag = sc.hasNextBoolean();
		
		return flag;
		
	}
	
	public static String InputOfOrder() {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Que orden de numero vas a introducir?");
		String order = sc.next();
		
		return order;
		
		
	}
}
