package chapter8;

public interface Product {

    double getPrice();
    void  setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void  setColor(String color);

    default void getBarcode(){
        System.out.println("This is a default method from the interface");
    }
}
