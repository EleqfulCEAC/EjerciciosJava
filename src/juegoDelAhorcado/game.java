package juegoDelAhorcado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays; 

public class game {

	public static void main(String[] args) {

		// variables globales 
		int contadorVidas = 5; 
		String palabraOculta = pedirPalabraOculta(); 
		int tamaño = palabraOculta.length();
		char [] progresoPalabra = new char [tamaño];
		List<String> historialLetra = new ArrayList<>();
		
		while(!comprobarPerdido(contadorVidas) && !comprobarGanador(palabraOculta, progresoPalabra)) {
			
			String Letra = pedirLetra();
			if(comprobarLetraHistorial(Letra, historialLetra)) {
				System.out.println("la letra ya ha sido usasda");
			} else {
				System.out.println("se ha guardado en el historial");
				ponerletra(progresoPalabra, Letra, palabraOculta, contadorVidas);
				imprimirInfo(progresoPalabra, historialLetra);
                comprobarGanador(palabraOculta, progresoPalabra);				
			}
			
		}
	}
	
	
	// funcionalidades
	
	public static String pedirLetra() {
		System.out.println("Introduce la letra que vas a jugar");
		Scanner sc = new Scanner(System.in);
		String Letra = sc.next();
		if(Letra.length() > 1) {
			System.out.println("Tienes que introducir solo una letra");
			return null; 
		} else {
			return Letra; 
		}
		
		
		
		
		
	}
	
	public static boolean comprobarGanador (String palabraOculta, char [] progresoPalabra) {

		   String palabraAcomprobar ="";
		
			for (char character : progresoPalabra) {
			 palabraAcomprobar = character + palabraAcomprobar;
			}
			
			if(palabraAcomprobar.equals(palabraOculta +"")) {
				return true; 
			} else {
				return false; 
			}
					 
			 }
	
	public static int restarVidas (int contadorDeVidas) {
		 return contadorDeVidas - 1 ;
		
		}
	
    public static boolean comprobarPerdido(int contadorDeVidas) {
		if(contadorDeVidas == 0) {
			return true; 
			
		} else {
			System.out.println("Sigue jugando te quedan " + contadorDeVidas + " vidas");
			return false; 
		}
		
	}
    
    public static void ponerletra (char [] progresoPalabra, String letra, String palabraOculta, int contadorVidas) {
    	
    	for (int i = 0; i < palabraOculta.length(); i++) {
			if(letra.equals(palabraOculta.charAt(i) + "")) {
				progresoPalabra[i] = letra.charAt(0);	
			} else {
				System.out.println("La letra no tiene ninguna coincidencia, intenta de nuevo");
				restarVidas(contadorVidas);
			}
		}
    	
    }
    
    public static void agregarLetraAlHistorial (String Letra, List<String> historialLetra ) {
    	historialLetra.add(Letra);
    	
    }
		
    public static boolean comprobarLetraHistorial (String Letra, List<String> historialLetra) {
    	String theLetter = "";
    	for (String isTheLetter : historialLetra) {
			 theLetter = isTheLetter;
		}
    	
    	if(theLetter.equals(Letra)) {
			 
			 return true; 
		 } else {
			 agregarLetraAlHistorial(Letra, historialLetra); 
			 return false;
			 
		 }
    	
    	
    }
    
    public static void imprimirInfo(char[] progresoPalabra, List<String> historialLetra) {
    	System.out.println("Progreso: ");
    	System.out.println(Arrays.toString(progresoPalabra));
    	System.out.println("---------------");
    	System.out.println("---------------");
    	System.out.println("Historial: ");
    	System.out.println(historialLetra);
    	
    }
    
    public static String pedirPalabraOculta() {
    	System.out.println("Introduce la palabra oculta");
    	Scanner sc = new Scanner(System.in);
    	String palabra = sc.next();
    	return palabra;
    	
    	
    }
    
	}

	



	



