package workshop6.Question3;

/**
 * Book
 */
public class Book {

	private int id;
	private String title;
	private String author;
	private int price;

	public Book() {
	}

	public Book(int id, String title, String author, int price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book createBook() {
		System.out.println("Enter id");
		id = Validator.inputIntLimit(0, 1000);
		System.out.println("Enter title");
		title = Validator.inputString();
		System.out.println();
	}

	@Override
	public String toString() {
		return "Book{author=" + author + ", id=" + id + ", price=" + price + ", title=" + title + "}";
	}


}
