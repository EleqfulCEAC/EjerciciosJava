package juegoTraduccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class juegoTraduccion {
	
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		
			System.out.println("Esta aplicacion traduce de letras a morse y viceversa");
			System.out.println("Escoge que opcion necesitas: 1-Letras/Morse --- 2-Morse/Letras ");
			int option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {

			case 1: {
				try {
					LetrasToMorse();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				
				break;
			}

			case 2: 
				System.out.println("op2");
				break;
			}
			
			}
			
	

	public static void LetrasToMorse () throws Exception {
		HashMap<Character, String> LetrasToMorse = new HashMap<>();
        // Llenar el HashMap con las letras del abecedario y sus correspondientes códigos Morse
        LetrasToMorse.put('A', ".-");
        LetrasToMorse.put('B', "-...");
        LetrasToMorse.put('C', "-.-.");
        LetrasToMorse.put('D', "-..");
        LetrasToMorse.put('E', ".");
        LetrasToMorse.put('F', "..-.");
        LetrasToMorse.put('G', "--.");
        LetrasToMorse.put('H', "....");
        LetrasToMorse.put('I', "..");
        LetrasToMorse.put('J', ".---");
        LetrasToMorse.put('K', "-.-");
        LetrasToMorse.put('L', ".-..");
        LetrasToMorse.put('M', "--");
        LetrasToMorse.put('N', "-.");
        LetrasToMorse.put('O', "---");
        LetrasToMorse.put('P', ".--.");
        LetrasToMorse.put('Q', "--.-");
        LetrasToMorse.put('R', ".-.");
        LetrasToMorse.put('S', "...");
        LetrasToMorse.put('T', "-");
        LetrasToMorse.put('U', "..-");
        LetrasToMorse.put('V', "...-");
        LetrasToMorse.put('W', ".--");
        LetrasToMorse.put('X', "-..-");
        LetrasToMorse.put('Y', "-.--");
        LetrasToMorse.put('Z', "--..");
        LetrasToMorse.put('0', "-----");
        LetrasToMorse.put('1', ".----");
        LetrasToMorse.put('2', "..---");
        LetrasToMorse.put('3', "...--");
        LetrasToMorse.put('4', "....-");
        LetrasToMorse.put('5', ".....");
        LetrasToMorse.put('6', "-....");
        LetrasToMorse.put('7', "--...");
        LetrasToMorse.put('8', "---..");
        LetrasToMorse.put('9', "----.");
        LetrasToMorse.put(' ', " / ");
		     System.out.println(LetrasToMorse);
		
		
		System.out.println("Introduce la palabra que deseas traducir");
		String palabra = sc.nextLine();
		List<String> traduccion = new ArrayList<>();
		System.out.println(palabra);
		
		
		for (int i = 0; i < palabra.length(); i++) {
			char letter = palabra.toUpperCase().charAt(i);
			
			if(Character.isWhitespace(letter)) {
					letter = ' ';
			}
			
			if(!LetrasToMorse.containsKey(letter)) {
					throw new Exception("El caracter que haz introducido es incorrecto");
			} 
			
			System.out.println(letter);
			
			String value = LetrasToMorse.get(letter);
			traduccion.add(value);
		}
		
		System.out.println("La palabra en codigo morse seria: " + traduccion);
	}
	
	
	public static void morseToEspañol() {
		
		HashMap<String, Character> morseToEspañol = new HashMap<>();
		morseToEspañol.put(".-", 'A');
        morseToEspañol.put("-...", 'B');
        morseToEspañol.put("-.-.", 'C');
        morseToEspañol.put("-..", 'D');
        morseToEspañol.put(".", 'E');
        morseToEspañol.put("..-.", 'F');
        morseToEspañol.put("--.", 'G');
        morseToEspañol.put("....", 'H');
        morseToEspañol.put("..", 'I');
        morseToEspañol.put(".---", 'J');
        morseToEspañol.put("-.-", 'K');
        morseToEspañol.put(".-..", 'L');
        morseToEspañol.put("--", 'M');
        morseToEspañol.put("-.", 'N');
        morseToEspañol.put("---", 'O');
        morseToEspañol.put(".--.", 'P');
        morseToEspañol.put("--.-", 'Q');
        morseToEspañol.put(".-.", 'R');
        morseToEspañol.put("...", 'S');
        morseToEspañol.put("-", 'T');
        morseToEspañol.put("..-", 'U');
        morseToEspañol.put("...-", 'V');
        morseToEspañol.put(".--", 'W');
        morseToEspañol.put("-..-", 'X');
        morseToEspañol.put("-.--", 'Y');
        morseToEspañol.put("--..", 'Z');

        // Llenar el HashMap con los códigos Morse de los números y sus correspondientes valores
        morseToEspañol.put("-----", '0');
        morseToEspañol.put(".----", '1');
        morseToEspañol.put("..---", '2');
        morseToEspañol.put("...--", '3');
        morseToEspañol.put("....-", '4');
        morseToEspañol.put(".....", '5');
        morseToEspañol.put("-....", '6');
        morseToEspañol.put("--...", '7');
        morseToEspañol.put("---..", '8');
        morseToEspañol.put("----.", '9');

        // El espacio en Morse se representa con " / "
        morseToEspañol.put(" / ", ' ');
        
        
        
        System.out.println("Introduce en codigo morse la palabra que deseas traducir ");
		String morse = sc.nextLine();
		List<String> traduccion = new ArrayList<>();
		System.out.println(morse);
		
		
		for (int i = 0; i < morse.length(); i++) {
			char letter = palabra.toUpperCase().charAt(i);
			
			if(Character.isWhitespace(letter)) {
					letter = ' ';
			}
			
			if(!LetrasToMorse.containsKey(letter)) {
					throw new Exception("El caracter que haz introducido es incorrecto");
			} 
			
			System.out.println(letter);
			
			String value = LetrasToMorse.get(letter);
			traduccion.add(value);
		}
		
		System.out.println("La palabra en codigo morse seria: " + traduccion);
        
        
        
		
	}
	
}


