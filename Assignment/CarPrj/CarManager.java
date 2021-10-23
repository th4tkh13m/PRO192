import Com.BrandList;
import Com.CarList;
import Com.Menu;

/**
 * CarManager
 */
public class CarManager {

	public static void main(String[] args) {
		BrandList brandList = new BrandList();
		brandList.loadFromFile("brands.txt");

		CarList carList = new CarList(brandList);
		carList.loadFromFile("cars.txt");

		int choice;
		Menu menu = new Menu();
	}
}
