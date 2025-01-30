package juegoBatallaNaval;

public class Jugador {
	 private Tablero board = new Tablero();
	 private boolean itsMyTurn;
	 
	 public Jugador(boolean itsMyTurn) {
		super();
		this.itsMyTurn = itsMyTurn;
		board.rellenarTablero();
	}
	 

	public Tablero getBoard() {
		return board;
	}


	public void atacar( int X, int Y) {
		 board.comprobarDisparo(X, Y);
	 }
	 
	 public void reciboDaño( int X, int Y) {
		 if(board.getTablero()[X][Y].equals(Types.HUNDIDO)) {
			 System.out.println("Daño recibido");
		 }
		 
		 if(!board.getTablero()[X][Y].equals(Types.HUNDIDO)) {
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
