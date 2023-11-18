package pizza1;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Anchovies", "Asparagus", "Broccoli",
                "Large", "Deep Pan" );


    }

    public Pizza makePizza(String topping1, String topping2,
                 String topping3, String size, String crust) {
        Pizza p = new Pizza(topping1, topping2, topping3, size, crust);
        return p;
    }

    public Pizza makePizza(String topping1, String topping2,
                           String topping3) {
        return makePizza(topping1, topping2, topping3, "Medium", "Classic Crust");
    }

    public Pizza makePizza(String topping1, String topping2) {

        return makePizza(topping1, topping2, "");
    }

    public Pizza makePizza(String topping1) {

        return makePizza(topping1, "", "");
    }

    public Pizza makePizza(String topping1, String topping2,
                           String topping3, String size) {
        return makePizza(topping1, topping2, topping3,
                size, "Classic Crust");
    }

}
