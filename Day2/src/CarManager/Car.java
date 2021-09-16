package CarManager;

public class Car {

    private String color;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car(String color, int enginePower, boolean convertible, boolean parkingBrake) {
        this.color = color;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the accelerator button");
    }

    public void output() {
        System.out.println("Car [color=" + color + ", convertible=" + convertible + ", enginePower=" + enginePower
                + ", parkingBrake=" + parkingBrake + "]");
    }

}
