package products;

import java.text.DecimalFormat;

public class ProductTester {
    public static void main(String[] args) {

        Product p1 = new Product("Tin of tomatoes", 0.90);
        System.out.println(p1.getDescription());

        Product p2 = new Product("Pack of artichokes",3.0);
        System.out.println(p2.getDescription());

        Order o = new Order();
        o.add(p1, 3);
        o.add(p2, 1);
//        o.totalCost = 100.00;
        System.out.println("price is " + o.getTotalCost());

    }
}
