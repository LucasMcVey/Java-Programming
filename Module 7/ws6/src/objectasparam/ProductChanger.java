package objectasparam;

public class ProductChanger {
    public void alterPrice(Product product, double newPrice) {
        product.setPrice(newPrice);
    }

    public void transmutePrice(Product product, double newPrice) {
        product = new Product("pistachio nuts", 0);
        product.setPrice(newPrice);
    }

    public void transmogrifyPrice(Product product, double newPrice) {
        product = new Product("pistachio nuts", 0);
        product.setPrice(111);
        newPrice = Math.PI; // has no effect on the variable in the method that calls this one
    }


}
