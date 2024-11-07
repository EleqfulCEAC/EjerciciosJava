package matrices;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ejerciciosMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfOperation = sc.nextInt();
		switch (numOfOperation) {
			
		  case 1:{
			  Ejercicio1();
			  
		  }
		
		}
	
	}
	
	
	// funciones globales
	
	
	public static void Ejercicio1() {
int [][] matriz = generadorDeMatriz(5, 5);
		
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz.length; y++) {
				matriz[x][y] = x+ y;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	
	public static int[][] generadorDeMatriz(int tamañoX, int tamañoY) {
		int [][] aux = new int[tamañoX][tamañoY];
		return aux; 
	} 


}
