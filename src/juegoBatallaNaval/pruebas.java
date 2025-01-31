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
			
			
			Disparo P1Shoot = player1.atacar(3, 2);
			Disparo player2RecivedShoot = player2Table.comprobarDisparo(P1Shoot);
			player2.reciboDaño(player2RecivedShoot);
			Disparo P2Shoot = player2.atacar(1, 3);
			Disparo player1RecivedShoot = player1Table.comprobarDisparo(P2Shoot);
			player1.reciboDaño(player1RecivedShoot);
			
			

	}

}
