package chapter8;

public class Book implements Product {

    //<editor-fold desc="Private Members">
    private  double price;
    private String name;
    private String color;
    //</editor-fold>

    //<editor-fold desc="Getter & Setters">
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {

    }
    //</editor-fold>
}
