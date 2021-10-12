package workshop5.Question08;

import java.util.ArrayList;

/**
 * Storage
 */
public class Storage implements ProductDAO {

	private ArrayList<Product> products = null;

	public Storage() {
		products = new ArrayList<Product>();
	}

	// @Override
	public Product getProduct(String code) {
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
			s = s + "CODE: " + col1 + " DESCRIPTION: " + col2 + " PRICE: " + p.getFormattedPrice() + "\n";
		}
		return s;
	}

	@Override
	public boolean addProduct(Product p) {
		products.add(p);
		// getProduct(p);
		return true;
	}

	@Override
	public boolean deleteProduct(Product p) {
		products.remove(p);
		return true;
	}

	@Override
	public boolean updateProduct(Product p) {
		int i = products.indexOf(p);
		products.remove(i);
		products.add(i, p);
		return true;
	}
}
