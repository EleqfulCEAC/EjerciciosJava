package TemaArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosDeArrays {

	public static void main(String[] args) {
		
		System.out.println("Introduce el numero de la operacion:");
		int numOperation = inputOfNumbers();
		
		switch (numOperation) {
		
		case 1: {
			Ejercicio1();
			break;
			
		}
		
		
		case 2: {
			Ejercicio2();
			break;
			
		}
		
		case 3: {
			Ejercicio3();
			break;
			
			
		}
		
		case 4: {
			Ejercicio4();
			break;
		}
		
		case 5:{
			Ejercicio5();
			break;
		}
		case 6: {
			Ejercicio6();
		}
		
		case 7: {
			Ejercicio7();
			
		}
		
		case 8: {
			Ejercicio8(); }
		}
	
		

	
}
		
		
		
	
// Ejercicios 	
	
	public static void Ejercicio1() {

		
		
		//1	Crea un array de 10 números enteros. Llénalo con valores y muestra la suma de todos los elementos del array. No usar el Arrays.fill()
		
				int [] numbers = generadorDeArray(10, 20);
				int totalNumbers = 0;
				
				System.out.println("Tienes una caja con 10 espacios, ya esta llena, te la mostrare y te dare la suma total");
				
				for (int i = 0; i < numbers.length; i++) {
					int addNumber =+ numbers[i];
					
					totalNumbers += addNumber;
					
				}
				
				System.out.println(Arrays.toString(numbers));
				System.out.println("El total de la suma de todos los numeros seria: " + totalNumbers);
					
			}

	
	public static void Ejercicio2() {
		
		// 2.	Declara un array de double de tamaño 5. Llénalo con valores y calcula el promedio de todos los números en el array.
		
		double [] numbersDouble = generadorDeArrayDecimales(5, 20); 
		System.out.println("Tienes una caja con: " + numbersDouble.length +  " espacios, ya esta llena, te dare el valor medio");
		 
		double totalNumbers = 0;
		
		
		for (int i = 0; i < numbersDouble.length; i++) {
			double addNumberDouble = numbersDouble[i];
			
			totalNumbers += addNumberDouble;
			
		}
		
		System.out.println("La media de todos los numeros seria: " + totalNumbers / numbersDouble.length);
		
		
		
	}
	
	public static void Ejercicio3() {
		//3. Crea un array de enteros con valores aleatorios entre 1 y 100. Muestra únicamente los números pares del array.
		
		int [] numArray = generadorDeArray(10, 100); 
		
		for (int i = 0; i < numArray.length; i++) {
				
			int numeroAleatorio = numArray[i];
			
			if(numeroAleatorio % 2 == 0) {
				System.out.print(numArray[i] + " ");			
			} 
		
		} 
		
		
	}
	
	
	public static void Ejercicio4() {
		// 4. Crea un array de 5 enteros y llénalo con valores. Imprime el array en orden inverso.
		
		int [] numArray = generadorDeArray(5, 30); 
		
				for (int i = numArray.length; i > 0; i--) {
					
					System.out.print(numArray[i-1] + " ");
					
				}
		
	} 
	
	
	public static void Ejercicio5() {
		// 5. Crea un array de enteros de tamaño 10 y encuentra el número mayor y el menor del array.

		
		int [] numArray = generadorDeArray(10, 1000); 
		Arrays.sort(numArray);

		int numMinus = numArray[0];
		int numMax = numArray[9];
				 
		System.out.println("El numero mayor del array es: " + numMax + " y el numero menor del array es: " + numMinus);
		
	} 
	
	public static void Ejercicio6() {
		//6. Declara un array de enteros y un número cualquiera. Escribe un programa que cuente cuántas veces aparece ese número en el array.
			
		
			int [] intArray = generadorDeArray(50, 10); 
			int numToCompare = 5;
			int contador = 0; 
			
			
			for (int i = 0; i < intArray.length; i++) {
				if(intArray[i] == numToCompare) {
					
					contador++;
					
				}
				
			}
			
			System.out.println("el numero " + numToCompare + " Aparece " + contador + " veces en este array");	
	}
	
	
public static void Ejercicio7() {
		String [] boxOfNames = new String [5];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < boxOfNames.length; i++) {
			System.out.println("Introduce el nombre numero " + i + " que estara en el array");
			String Name = input.next(); 
		    boxOfNames[i] = Name;
		
		}
		System.out.println(Arrays.toString(boxOfNames));
		System.out.println("introduce el nombre que deseas verificar");
		String NameToCompare = input.next();
		String savedname = " ";
		
		
		for (int i = 0; i < boxOfNames.length; i++) {
			savedname = boxOfNames[i];
			if(savedname == NameToCompare) {
				System.out.println("El nombre " + NameToCompare + " si se encuentra dentro del array");	
				break;
			} else {
				System.out.println(savedname);
				System.out.println("No se encuentra ese nombre");
			}
		}
		
		
		
		
		
		
	}


public static void Ejercicio8() {
	int [] numberBox1 = generadorDeArray(5, 10);
	int [] numberBox2= generadorDeArray(5, 10); 
	int [] numberBox3 = new int[10]; 
	int indice = 0;
	
	for (int i = 0; i < numberBox1.length; i++) {
		numberBox3[i] = numberBox1[i];
		
	}
	
	for (int i = 5; i < numberBox3.length; i++) {
		numberBox3[i] = numberBox2[indice];
		indice++;
		
		
	}
	
	System.out.println(Arrays.toString(numberBox3));
	
	
}

	
//Global functions: 	
	
public static int[] generadorDeArray(int tamaño, int numMax) {
	int [] aux = new int[tamaño];
	Random rd = new Random (); 
	
	for (int i = 0; i < tamaño; i++) {
		aux[i] = rd.nextInt(numMax); 
	}
	
	System.out.println(Arrays.toString(aux));
	return aux; 
} 


public static double[] generadorDeArrayDecimales(int tamaño, int numMax) {
	double [] aux = new double[tamaño];
	Random rd = new Random (); 
	
	for (int i = 0; i < tamaño; i++) {
		aux[i] = rd.nextDouble(numMax); 
	}
	
	System.out.println(Arrays.toString(aux));
	return aux; 
}
	
public static int inputOfNumbers(int i) {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Introduce a continuacion el numero en el orden: " + i);
		int num = sc.nextInt();
		
		return num;
		
	}	
		
public static int inputOfNumbers() {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Introduce a continuacion el numero en el orden: ");
		int num = sc.nextInt();
		
		return num;
		
	}


public static double inputOfDouble(int i) {
	Scanner sc = new Scanner (System.in); 
	System.out.println("Introduce a continuacion el numero en el orden: " + i);
	double num = sc.nextDouble();
	
	return num;
	
}

}



	
		
