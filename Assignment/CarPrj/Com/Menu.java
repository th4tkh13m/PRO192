package Com;

import java.util.ArrayList;

/**
 * Menu
 */
public class Menu {

	public static int int_getChoice(ArrayList<E> options) {
		int reponse;
		int numChoice = options.size();
		for (int index = 0; index < numChoice; index++) {
			System.out.println(index + 1 + ". " + options.get(index));
		}
		// System.out.println("Please choose an option from 1 to " + numChoice);
		reponse = Validator.inputInt(1, numChoice);

	}

	public static E ref_getChoice(ArrayList<E> options) {
		int reponse;
		int numChoice = options.size();
		do {
			reponse = int_getChoice(options);
		} while (reponse < 0 || reponse > numChoice);
	}

}
