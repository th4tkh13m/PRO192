package workshop5.Question07;

public class ProductDB {
    public static Product getProduct(String productCode) {

        Product p = null;
        if (productCode.equalsIgnoreCase("java") || productCode.equalsIgnoreCase("jsps")
                || productCode.equalsIgnoreCase("mcb2")) {
            Book b = new Book();
            if (productCode.equalsIgnoreCase("java")) {
                b.setCode(productCode);
                b.setDescription("Beginning Java");
                b.setPrice(49.50);
                b.setAuthor("Andrea Steelman");
            } else if (productCode.equalsIgnoreCase("jsps")) {
                b.setCode(productCode);
                b.setDescription("Java Servlets and JSP");
                b.setPrice(49.50);
                b.setAuthor("Andrea Steelman");
            }

            else if (productCode.equalsIgnoreCase("mcb2")) {
                b.setCode(productCode);
                b.setDescription("Mainframe COBOL");
                b.setPrice(59.50);
                b.setAuthor("Mike Murach");
            }
            p = b; 
        } else if (productCode.equalsIgnoreCase("txtp")) {
            Software s = new Software();
            s.setCode("txtp");
            s.setDescription("TextPad");
            s.setPrice(27.00);
            s.setVersion("4.7.3");
            p = s; 
        }
        return p;
    } 
}
