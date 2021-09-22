package workshop2.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book();
        Author author = new Author("Naoki");
        book.setAuthor(author);
        System.out.println(book);
    
        book.setTitle("This is not a title");
        book.setFiction(false);
        book.setNoOfPages(2010);
        System.out.println(book);
    
    
     }

}
