package workshop5.Question08;

import java.util.ArrayList;

import workshop5.Question08.Product;
import workshop5.Question08.ProductDAO;

/**
 * Storage
 */
public class Storage implements ProductDAO {

	private ArrayList<Product> products = null;

	public Storage() {
		products = new ArrayList<Product>();
	}

	public Product geProduct(String code) {
		Product p = null;
		for (int i = 0; i < products.size(); i++) {
			p = products.get(i);
			if (p.getCode().equals(code)) {
				return p;
			}
		}
		return null;
	}
	@Override
	public String getProductsString() {
		Product p = null;
		String s = "";
		for (int i = 0; i < products.size(); i++) {
			p = products.get(i);
			String col1 = p.getCode();
			String col2 = p.getDescription();
			s = s + col1 + col2 + p.getFormattedPrice();
		}
		return s;	
	}
}
