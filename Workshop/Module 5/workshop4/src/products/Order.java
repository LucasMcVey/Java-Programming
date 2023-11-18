package products;

public class Order {
    private double totalCost = 0;

    public void add (Product p, int quantity) {
        double subtotal = quantity * p.getPrice();
        totalCost += subtotal;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
