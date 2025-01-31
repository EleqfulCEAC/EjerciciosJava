package juegoBatallaNaval;

public class Jugador {
	 private Tablero board = new Tablero();
	 private boolean itsMyTurn;
	 
	 public Jugador(boolean itsMyTurn) {
		super();
		board.rellenarTablero();
	}
	 

	public Tablero getBoard() {
		return board;
	}


	public Disparo atacar( int X, int Y) {
		Disparo shoot = new Disparo(X, Y);
		return shoot;
	 }
	 
	 public void reciboDaño( Disparo disparoRecibido) {
		 
		 int coordX = disparoRecibido.getX();
		 int coordY = disparoRecibido.getY();
		 
		 if(board.getTablero()[coordX][coordY].equals(Types.HUNDIDO)) {
			 System.out.println("Daño recibido");
		 }
		 
		 if(!board.getTablero()[coordX][coordY].equals(Types.HUNDIDO)) {
			 System.out.println("Estoy bien, sin daños");
		 }
	 }
	 
	 public void comprobarNumBarcos() {
		 
		 int barcosCounter = 0;
		 
		 for (int i = 0; i < board.getTablero().length; i++) {
				for (int j = 0; j < board.getTablero()[i].length; j++) {
					if(board.getTablero()[i][j].equals(Types.BARCO)) {
						barcosCounter++;
					}
				}
				
			}
		 System.out.println("actualmente quedan: " + barcosCounter + " Barcos");
	 }

}
