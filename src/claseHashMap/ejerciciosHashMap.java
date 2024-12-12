package claseHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

public class ejerciciosHashMap {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce el numero de la operacion:");
		int numOperation = sc.nextInt();
		sc.nextLine();

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

			break;
		}

		case 4: {

			break;
		}

		}
	}

	public static void ejercicio1() {

		System.out.println("introduce las palabras al array");
		String palabras[] = new String[10];

		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = sc.next();

		}
		System.out.println(Arrays.toString(palabras));

		HashMap<String, Integer> dicc = new HashMap<>();
		for (int i = 0; i < palabras.length; i++) {
			String palabra = palabras[i];
			if (!dicc.containsKey(palabra)) {
				dicc.put(palabra, 1);
			} else {
				int counter = dicc.get(palabra);
				counter++;
				dicc.put(palabra, counter);
			}
		}

		System.out.println(dicc);

	}

	public static void ejercicio2() {
		HashMap<String, Integer> products = new HashMap<>();
		List<String> productoFiltrado = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce el nombre del producto");
			String productos = sc.nextLine();
			System.out.println("Introduce su precio");
			int precio = sc.nextInt();
			sc.nextLine();
			products.put(productos, precio);

		}

		System.out.println(products);
		System.out.println("introduce el precio que deseas buscar");
		int busquedaPrecio = sc.nextInt();
		sc.nextLine();

		for (String nombreDelProducto : products.keySet()) {
			if (products.get(nombreDelProducto) == busquedaPrecio) {
				productoFiltrado.add(nombreDelProducto);
			}
		}

		System.out.println(productoFiltrado);

	}
	
	public static void ejercicio3() {
		
	}
		


}
