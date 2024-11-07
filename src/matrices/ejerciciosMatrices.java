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
			  break;
			  
		  }
		  
		  case 2:{
			 Ejercicio2(); 
			 
		  }
		
		}
	
	}
	
	
	// funciones globales
	
	
	public static void Ejercicio1() {
int [][] matriz = generadorDeMatriz(5, 6);
		
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz.length; y++) {
				matriz[x][y] = x+ y;
			}
		}
		
		showMatriz(matriz);
		
	}
	public static void Ejercicio2() {
		int [][] newMatriz = new int[5][5]; 
        showMatriz(newMatriz);		
        
        int counterX = newMatriz.length;
        boolean flag = false;
        
        for (int i = 0; i < newMatriz.length; i++) {
        		if(counterX == newMatriz[i].length) {
        			flag = true;
        			
        		}
        		
        	if(flag) {
        		System.out.println("es cuadrada");
        		
        	} else {
        		System.out.println("no es cuadrada");
        		
        	}
		}
       
		
		
		
	}
	
	
	public static int[][] generadorDeMatriz(int tamañoX, int tamañoY) {
		int [][] aux = new int[tamañoX][tamañoY];
		return aux; 
	} 
	
	
	public static void showMatriz(int[][]m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}


}
