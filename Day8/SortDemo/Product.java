package SortDemo;

public class Product implements Comparable<Product> {
    private int id;
    private String name, origin;
    public Product(int id, String name, String origin) {
        this.id = id;
        this.name = name;
        this.origin = origin;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", origin=" + origin + "]";
    }
    @Override
    public int compareTo(Product o) {
        return this.id - o.id;
    }
}
