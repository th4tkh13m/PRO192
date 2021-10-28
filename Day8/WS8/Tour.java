package WS8;


public abstract class Tour implements ITour {
    protected String code, title;
    protected double price;
    protected String transport;
    protected String startDate, endDate;

    public Tour(String code, String title, double price, String transport, String startDate, String endDate) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.transport = transport;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public double calculateSurcharge() {
        return 0;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Tour [endDate=" + endDate + ", code=" + code + ", price=" + price + ", startDate=" + startDate
                + ", title=" + title + ", transport=" + transport + "]";
    }


}
