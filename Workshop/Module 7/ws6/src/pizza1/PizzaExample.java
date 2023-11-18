package pizza1;

public class PizzaExample {
    public static void main(String[] args) {
        PizzaMaker pm = new PizzaMaker();
        Pizza p1 = pm.makePizza("Anchovies", "Asparagus", "Broccoli",
                "Large", "Deep Pan");

        Pizza p2 = pm.makePizza("Bacon", "Capsicum", "Pineapple");

        Pizza p3 = pm.makePizza("Spam");
    }
}
