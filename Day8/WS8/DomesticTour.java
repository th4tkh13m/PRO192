package WS8;

public class DomesticTour extends Tour {
    private double tourGuideTip;

    public DomesticTour(String code, String title, double price, String transport, String startDate, String endDate,
            double tourGuideTip) {
        super(code, title, price, transport, startDate, endDate);
        this.tourGuideTip = tourGuideTip;
    }

    public int getDateNumber() {
        return 0;
    }
 
    @Override
    public double calculateSurcharge() {
        return getDateNumber() * tourGuideTip;
    }

    @Override
    public double calculateCharge() {
        return calculateSurcharge() + price;
    }

    

    public double getTourGuideTip() {
        return tourGuideTip;
    }

    public void setTourGuideTip(double tourGuideTip) {
        this.tourGuideTip = tourGuideTip;
    }

    @Override
    public String toString() {
        return "DomesticTour [" + super.toString() + "tourGuideTip=" + tourGuideTip + "]";
    }

}
