package workshop2.GuitarShop;

public class Guitar {

    private String serialNumber;
    private int price;
    private String buider;
    private String model;
    private String backWood;
    private String topWood;

    public Guitar() {
    }

    public Guitar(String serialNumber, int price, String buider, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.buider = buider;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuider() {
        return buider;
    }

    public void setBuider(String buider) {
        this.buider = buider;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public void createSound() {
        System.out.println("serialNumber:" + this.getSerialNumber());
        System.out.println("price:" + this.getPrice());
        System.out.println("builder:" + this.getBuider());
        System.out.println("model:" + this.getModel());
        System.out.println("backWood:" + this.getBackWood());
        System.out.println("topWood:" + this.getTopWood());
    }
}
