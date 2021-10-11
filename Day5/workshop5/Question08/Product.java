package workshop5.Question08;

import java.text.NumberFormat;

/**
 * Product
 */
public class Product {

	private String code;
	private String description;
	private double price;

	public Product() {
	}

	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Product) {
			Product product1 = (Product) obj;
			if (code.equals(product1.getCode()) && description.equals(product1.getDescription())
					&& price == product1.getPrice()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Code " + code + "\n" + "Description " + description + "\n" + "Price " + price;
	}
}
