package juegoBatallaNaval;

public class pruebas {

	public static void main(String[] args) {
			Jugador player1 = new Jugador(true);
			Jugador player2 = new Jugador(false); 
			
			Tablero player1Table = player1.getBoard();
			Tablero player2Table = player2.getBoard();
			
			System.out.println("Tablero del jugador 1: ");
			player1Table.representarTablero();
			System.out.println("------");
			System.out.println("Tablero del jugador 2");
			player2Table.representarTablero();
			System.out.println("------");

			

	}

}
