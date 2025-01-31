package juegoBatallaNaval;

import java.util.Random;

public class Tablero {
	private Types[][] tablero;

	public Tablero() {
		tablero = new Types[5][5];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = Types.AGUA;

			}
		}
	}
	
	

	public Types[][] getTablero() {
		return tablero;
	}



	public void representarTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void rellenarTablero() {
		Random rd = new Random();

		int contadorBarcos = 0;
		while (contadorBarcos < 6) {
			int positionX = rd.nextInt(0, 4);
			int positionY = rd.nextInt(0, 4);
			if (tablero[positionX][positionY] == Types.AGUA) {
				tablero[positionX][positionY] = Types.BARCO;
					contadorBarcos++;
			}
			
			

		}

	}
	
	
	public void comprobarDisparo(Disparo shoot) {
		
		int coordX = shoot.getX();
		int coordY = shoot.getY();
		
		
		
		if(tablero[coordX][coordY] == Types.AGUA) {
			tablero[coordX][coordY] = Types.FALLIDO;
			System.out.println("Haz fallado");
		}
		
		if(tablero[coordX][coordY] == Types.BARCO) {
			tablero[coordX][coordY] = Types.HUNDIDO;
			System.out.println("Disparo acertado");
		}
		
		
		
	}
}
