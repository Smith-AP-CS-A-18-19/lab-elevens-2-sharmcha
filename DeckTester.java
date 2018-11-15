/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

		//making and testing deck 1
		String[] r1 = {"ace"};
		String[] s1 = {"spades"};
		int[] v1 = {1};
		Deck d1 = new Deck(r1, s1, v1);
		System.out.println(d1.isEmpty());
		System.out.println(d1.size());
		System.out.println(d1.deal());
		System.out.println(d1.size());
		System.out.println(d1.isEmpty());

		System.out.println(" ");

		//making and testing deck 2
		String[] r2 = {"ace", "queen"};
		String[] s2 = {"spades"};
		int[] v2 = {1, 12};
		Deck d2 = new Deck(r2, s2, v2);
		System.out.println(d2.size());
		System.out.println(d2.isEmpty());

		System.out.println(" ");

		//making and testing deck 3
		String[] r3 = {"ace", "queen", "king"};
		String[] s3 = {"spades"};
		int[] v3 = {1, 12, 13};
		Deck d3 = new Deck(r3, s3, v3);
		System.out.println(d3.isEmpty());
		System.out.println(d3.size());

	}
}
