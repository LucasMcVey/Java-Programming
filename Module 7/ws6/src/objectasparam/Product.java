package objectasparam;

public class Product {
    private String name = "";
    private double price;

    // Alternative versions of the constructor. The first one works,
    // but the second one doesn't.

//    public Product(String n, double p) {
//        name = n;
//        price = p;
//    }

//    public Product(String name, double price) {
//        name = name;
//        price = price;
//    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double p) {
        price = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}
