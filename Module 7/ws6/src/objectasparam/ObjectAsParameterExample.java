package objectasparam;

public class ObjectAsParameterExample {
    public static void main(String[] args) {
        ProductChanger pc = new ProductChanger();
        double originalPrice = 7.35;
        double newPrice = 9.99;
        Product p1 = new Product("dogfood", originalPrice);
        System.out.println("Price is " + p1.getPrice());
        pc.alterPrice(p1, newPrice);
        System.out.println("Price is " + p1.getPrice());

        double bogusPrice = 4.44;
        pc.transmutePrice(p1, bogusPrice);
        System.out.println("Price is " + p1.getPrice());

        pc.transmogrifyPrice(p1, bogusPrice);
        System.out.println("Price is " + p1.getPrice());
        System.out.println("and the value of bogusPrice is " + bogusPrice);
    }
}
