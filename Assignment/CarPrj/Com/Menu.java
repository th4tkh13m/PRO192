package Com;

import java.util.ArrayList;

/**
 * Menu
 */
public class Menu {

	public int int_getChoice(ArrayList<Brand> options) {
		int reponse;
		int numChoice = options.size();
		for (int index = 0; index < numChoice; index++) {
			System.out.println(index + 1 + ". " + options.get(index));
		}
		reponse = Validator.inputInt(1, numChoice);
		return reponse;
	}

	public Brand ref_getChoice(ArrayList<Brand> options) {
		int reponse;
		int numChoice = options.size();
		do {
			reponse = int_getChoice(options);
		} while (reponse < 0 || reponse > numChoice);
		return options.get(reponse - 1);
	}
}
