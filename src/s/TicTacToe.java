package s;
/**
 * logic programm of TicTacToe
 *
 * @author Seifeddine Makhlouf
 * @version 1.0
 * @since 2020
 */
import java.util.Scanner;

public class TicTacToe {
	// 2D array to store the game board
	private String Spielfeld[][] = new String[3][3];
	// two player objects
	Spieler s1;
	Spieler s2;
	// current player
	Spieler ak;

	public TicTacToe(Spieler s1, Spieler s2) {
		this.s1 = s1;
		this.s2 = s2;

		// initialize the game board
		this.Inistialisiere();
		// set player 1 as the current player
		this.ak = s1;
		while (true) {
			if (Spielen(ak)) {
				// check if the current player has won
				if (hasWon(Spielfeld, ak)) {
					System.out.println(ak.getName() + " hat gewonnen");
					break;
				}
				// switch the current player
				if (ak.getName() == s1.getName())
					ak = s2;
				else
					ak = s1;

			}
		}

	}

	// method to initialize the game board
	public void Inistialisiere() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Spielfeld[i][j] = "  ";
			}
		}
	}

	// method to print the game board
	public void Druck() {
		System.out.println(" |0 |1 | 2|");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + "|");
			for (int j = 0; j < 3; j++) {
				System.out.print(Spielfeld[i][j] + "|");
			}
			System.out.println();
		}
	}

	/**
	 * Method to place a player's game piece on the game board
	 * 
	 * @param s The player who is placing the game piece
	 * @param x The x-coordinate of the game piece on the board
	 * @param y The y-coordinate of the game piece on the board
	 * @param a The number of the game piece the player wants to place
	 * @return True if the game piece is successfully placed, false otherwise
	 */
	public Boolean setzeStein(Spieler s, int x, int y, int a) {

		// check if the player has any game pieces of the chosen type left
		if (s.getSteinenumber(a - 1) > 0) {
			// check if the chosen space on the board is empty
			if (Spielfeld[x][y] != "  ") {
				int b = 0;
				// check which game piece is already on the chosen space
				for (int i = 0; i < 3; i++) {
					if ((Spielfeld[x][y] == s1.getSteine(i)) || (Spielfeld[x][y] == s2.getSteine(i)))
						b = i;

				}
				// check if the player is placing a larger game piece on top of a smaller one
				if ((a - 1) > b) {
					// remove one of the player's game pieces of the chosen type
					s.Desincrementsteine(a - 1);
					// place the game piece on the board
					Spielfeld[x][y] = s.getSteine(a - 1);
					return true;

				} else {
					System.out.println(
							"darf du nicht diese Steine an diese Stelle benutzen wällen Sie eine Grosserer Steine ");
					return false;
				}
			}

			else {
				s.Desincrementsteine(a - 1);
				Spielfeld[x][y] = s.getSteine(a - 1);
				return true;
			}

		}

		else {
			System.out.println("keine Steine mehr von typ " + (a));
			return false;
		}

	}

	/**
	 * Method to prompts the current player to input the row, column, and game piece
	 * number they want to place on the board, and calls the setzeStein method to
	 * place the game piece.
	 * 
	 * @param aktuell The player who is placing the game piece
	 * @return True if the game piece is successfully placed, false otherwise
	 */
	public boolean Spielen(Spieler aktuell) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int a = 0;

		this.Druck();

		System.out.println(aktuell.getName() + " gib mir die zeile");
		x = sc.nextInt();
		System.out.println(aktuell.getName() + " gib mir die Spalte");
		y = sc.nextInt();

		System.out.print("ihre verfügbare steine sind ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < aktuell.getSteinenumber(i); j++) {
				System.out.print(" " + aktuell.getSteine(i));
			}
		}

		System.out.println(aktuell.getName() + " gib mir die Steine nummer");
		a = sc.nextInt();

		return setzeStein(aktuell, x, y, a);

	}

	/**
	 * Überprüft, ob das Spiel gewonnen wurde, indem die Reihen, Spalten und
	 * Diagonalen des Spielbretts überprüft werden.
	 * 
	 * @param board  Das aktuelle Spielbrett
	 * @param player Der Spieler, dessen Spielsteine überprüft werden sollen
	 * @return True, wenn der Spieler gewonnen hat, ansonsten false.
	 */
	public static boolean hasWon(String[][] board, Spieler player) {
		// Überprüfe die Reihen

		char x = player.getSteine(0).charAt(0);
		for (int i = 0; i < 3; i++) {
			if (board[i][0].charAt(0) == x && board[i][1].charAt(0) == x && board[i][2].charAt(0) == x) {
				return true;
			}
		}

		// Überprüfe die Spalten
		for (int i = 0; i < 3; i++) {
			if (board[0][i].charAt(0) == x && board[1][i].charAt(0) == x && board[2][i].charAt(0) == x) {

				return true;
			}
		}

		// Überprüfe die Diagonalen
		if (board[0][0].charAt(0) == x && board[1][1].charAt(0) == x && board[2][2].charAt(0) == x) {

			return true;
		}
		if (board[0][2].charAt(0) == x && board[1][1].charAt(0) == x && board[2][0].charAt(0) == x) {

			return true;
		}

		// Wenn keine der Bedingungen erfüllt ist, hat der Spieler nicht gewonnen
		return false;
	}

}
