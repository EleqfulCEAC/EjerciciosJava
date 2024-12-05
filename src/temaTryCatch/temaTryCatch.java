package temaTryCatch;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

public class temaTryCatch {
	static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		System.out.println("Introduce el numero de la operacion:");
		int numOperation = sc.nextInt();
		
		switch (numOperation) {
			
		 case 1: {
			 ejercicio1();
			 break;
		 }
		 
		 case 2: {
			 ejercicio2();
			 break;
		 }
		 
		 case 3: {
			 ejercicio3();
			 break;
		 }
		 
		 case 4: {
			 ejercicio4();
			 break;		
		 }
		 
		 
		
		}
		
		
		
		

}
	
	public static void ejercicio1() {
		try {
			System.out.println("Introduce dos numeros y los dividiremos");
			System.out.println("Introduce el primer numero");
			int primerNumero = sc.nextInt();	
			System.out.println("Introduce el segundo numero");
			int segundonumero = sc.nextInt();
			
			int resultado = primerNumero / segundonumero; 
			System.out.println(resultado);
			
		} catch (Exception ArithmeticException) {
				System.out.println("error el divisor es 0");
	}
	}
	
	public static void ejercicio2() {
		try {
			System.out.println("Introduce un numero");
			int primerNumero = sc.nextInt();	
			
		} catch (Exception NumberFormatException) { 
			System.out.println("no es un numero");
		}
	}
	
	public static void ejercicio3() {
		int [] myArray = new int[5];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = 1 + i;
		}
		
		try {
			System.out.println("a que posicion quieres acceder");
			int position = sc.nextInt();
			System.out.println(myArray[position]);
			
		} catch (Exception ArrayIndexOutOfBoundsException ) {
			System.out.println("Ese indice no existe");
		}
		
		
		
	}
	
	public static void ejercicio4() {
		
		try {
			String cadena = sc.next();
			if(cadena.length() < 3) {
				throw new Exception("La cadena es muy corta, introduce al menos 3 caracteres");
			}
			
			String aux = cadena.substring(0, 3); 
			int num = Integer.parseInt(aux);
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println("No es un numero");
			
		} catch (Exception e) {
			e.getMessage();
			
		}
		
		
		
		
	}
}



