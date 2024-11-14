package tresEnRaya;

import java.util.Scanner;
import java.util.Arrays;

public class tresEnRaya {

	public static void main(String[] args) {
			String jugador1 = "x";
			String jugador2 = "o";
			String [][] tablero = new String[3][3];
			boolean turno = false; 
			inicializarTablero(tablero);
			imprimirTablero(tablero);
			pedirPosicion();
			

	}
	
	public static boolean comprobarGanador (String[][] tablero, String Jugador) {
		boolean haGanado = false;
		
		for (int i = 0; i < tablero.length; i++) {
			int celdaV = 0; 
			if(tablero[i][celdaV] != Jugador) {
				celdaV++;
				i= 0;
				if(celdaV >= 3) {
					break;
				} else {
					System.out.println("Siguiente celda");
				}
			} else {
				System.out.println("el " + Jugador + " gano de forma horizontal");
				haGanado = true;
				
			}
		}
		
		return haGanado;
		
	}
	
	public static void inicializarTablero(String[][] tablero) {
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = "-";
			}
		}
		
	}
	
	public static void imprimirTablero(String [][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
		
	}
		
	public static boolean cambiarTurno(boolean turno) {

		return !turno;
		
	}
	
	public static void ponerFicha(String[][]tablero, int[] posicion, String jugador) {	
		tablero[posicion[0]][posicion[1]] = jugador;
		
	}
	
	public static boolean comprobarTablas(String[][] tablero) {

		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if(tablero[i][j].equals("_")) {
					return false; 
				}
			}
		}
		return false; 
	}
	
	public static boolean poscicionValida(String[][] tablero, int[]posicion) {
		return tablero[posicion[0]][posicion[1]].equals("-");
	}
	
	public static int[] pedirPosicion() {
		Scanner sc =  new Scanner(System.in);
		int[] posicion = new int[2];
		
		
		boolean game = true;
		int maxPosicionXY = 2; 
		
		
		while(game) {
			int posX = sc.nextInt();
			if(posX > maxPosicionXY) {
				System.out.println("Posicion invalida X, intente de nuevo");
				game = true;
			} 
			if(posX <= maxPosicionXY) {
				posicion[0] = posX;
				game = false; 
				break;
			}
			
		} 
		
		game = true;
		while(game) {
			int posY = sc.nextInt();
			if(posY > maxPosicionXY) {
				System.out.println("Posicion invalida Y, intente de nuevo");
				game = true;
			} 
			if(posY <= maxPosicionXY) {
				posicion[1] = posY;
				game = false; 
				break;
			}
			
		}
		
		System.out.println(Arrays.toString(posicion));
		
		
		
		
		return posicion;
	}
}



