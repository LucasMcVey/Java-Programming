package products;

import java.text.DecimalFormat;

public class Product {
    private String name = "";
    private double price;

    public Product(String n, double p) {
        name = n;
        price = p;
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

    public String getDescription() {
        DecimalFormat df = new DecimalFormat("0.00");

        return getName() + " costs $" + df.format(getPrice());
    }

}
