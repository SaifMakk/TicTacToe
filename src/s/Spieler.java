package s;
/**
 * \file			  Spieler.java
 * \brief			  contains the Spieler class implementation which represents
 *                    a player in the TicTacToe game.
 *
 * The Spieler class initializes a player with a name and a set of stones. 
 * Each player has three stones of 2 different types.
 *
 * @author Seifeddine Makhlouf
 * @version 1.0
 * @since 2020
 */

/**
 * 
 * The Spieler class represents a player in a game.
 */
public class Spieler {
// The name of the player.
	private String Name;
// An array of stones, represented as strings.
	private String Steine[] = { "1", "2", "3" };
// An array of integers representing the number of stones of each type that the player has.
	private int Steinenumber[] = { 2, 2, 2 };

	/**
	 * 
	 * Initializes a new instance of the Spieler class with the specified name and
	 * prefix for stone names. The Steine array is initialized by concatenating the
	 * prefix with each stone name.
	 * 
	 * @param Name The name of the player.
	 * @param x    The prefix for stone names.
	 */
	public Spieler(String Name, String x) {
		this.Name = Name;
		for (int i = 0; i < 3; i++) {
			Steine[i] = x + Steine[i];
		}
	}

	/**
	 * 
	 * Returns the ith stone from the Steine array.
	 * 
	 * @param i The index of the stone to return.
	 * @return The ith stone from the Steine array.
	 */
	public String getSteine(int i) {
		return Steine[i];
	}

	/**
	 * 
	 * Returns the number of stones of the ith type from the Steinenumber array.
	 * 
	 * @param i The index of the stone type.
	 * @return The number of stones of the ith type from the Steinenumber array.
	 */
	public int getSteinenumber(int i) {
		return Steinenumber[i];
	}

	/**
	 * 
	 * Decrements the number of stones of the ith type by 1, if the number is
	 * greater than 0.
	 * 
	 * @param i The index of the stone type.
	 */
	public void Desincrementsteine(int i) {
		if (Steinenumber[i] > 0)
			Steinenumber[i] = Steinenumber[i] - 1;
	}

	/**
	 * 
	 * Returns the name of the player.
	 * 
	 * @return The name of the player.
	 */
	public String getName() {
		return this.Name;
	}
}