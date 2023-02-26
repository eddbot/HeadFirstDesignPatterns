package Beverages;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size = Size.GRANDE;
    public enum Size { TALL, GRANDE, VENTI};
    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return size;
    }

    public abstract double cost();
}

