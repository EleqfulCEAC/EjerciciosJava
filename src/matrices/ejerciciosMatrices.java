package matrices;

import java.util.Arrays;
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
		  
		  case 3: {
			  Ejercicio3();
			  
		  }
		  
		  case 4: {
			  Ejercicio4();
		  }
		  
		  case 5: {
			  Ejercicio5();
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
	
	public static void Ejercicio3() {
		int[][] first = generadorDeMatriz(3, 3);
		int[][] second = generadorDeMatriz(3, 3); 
		int[][] third = generadorDeMatriz(3, 3); 
		
		Random rd = new Random(); 
		
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < third.length; j++) {
				first[i][j] = rd.nextInt(10);
				second[i][j] = rd.nextInt(10);
			}
		}
		
		showMatriz(first);
		System.out.println("--------------------");
		showMatriz(second);
		
		
		for (int i = 0; i < third.length; i++) {
			for (int j = 0; j < third.length; j++) {
				third[i][j] = first[i][j] + second[i][j];
			}
		}
		System.out.println("Matriz final -----");
		showMatriz(third);
		
		
	}
	
	
	public static void Ejercicio4() {
		int[][] first = generadorDeMatriz(3, 3);
		int[][] second = generadorDeMatriz(3, 3); 
		
		
         Random rd = new Random(); 
		
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first.length; j++) {
				first[i][j] = i;
			}
		}
		
		showMatriz(first);
		System.out.println("------------");
		
		
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second.length; j++) {
				 second[i][j] = first[j][i];
			}
		}
		
		System.out.println("Traspuestas: -----");
		showMatriz(second);
	}
	
	
	public static void Ejercicio5() {
		int [][] matrix = generadorDeMatriz(7, 7);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if((j == i)) {
					matrix[i][j] = 1;
				}
				
			}
		}
		showMatriz(matrix);
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
