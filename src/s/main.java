/**
 * \file			main.java
 * \brief			Contains the main method for starting the TicTacToe game.
 *
 * This file creates two instances of the Spieler class, initializes them with names and symbols, and then creates a TicTacToe object 
 * with those players. This is the entry point for the Tic Tac Toe game.
 *
 * @author Seifeddine Makhlouf
 * @version 1.0
 * @since 2020
 */

package s;

/**
 * This is the main class for the Tic Tac Toe game. It creates two instances of the Spieler class to represent 
 * the players, and an instance of the TicTacToe class to represent the game board.
 */

public class main {

	/**
	 * The main method creates two Spieler objects representing the players, and a TicTacToe object representing the game board.
	 * It then starts the game by calling the start method of the TicTacToe object.
	 *
	 * @param args This parameter is not used in this program.
	 */
	public static void main(String[] args) {
		// Create a new Spieler object named seif with the name "seif" and the mark "x".
		Spieler seif = new Spieler("seif", "x");
		
		// Create a new Spieler object named yosr with the name "yosr" and the mark "o".
		Spieler yosr = new Spieler("yosr", "o");
		
		// Create a new TicTacToe object with seif and yosr as players.
		TicTacToe x = new TicTacToe(seif, yosr);
	}

}
