package pizza2;

public class Pizza {
    String topping1 = "";
    String topping2 = "";
    String topping3 = "";

    String size = "";
    String crust = "";

    public Pizza(String topping1, String topping2,
                            String topping3, String size, String crust) {
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.size = size;
        this.crust = crust;
    }

    public Pizza(String topping1, String topping2,
                 String topping3) {
        this(topping1, topping2, topping3, "Medium", "Classic Crust");
    }

    public Pizza(String topping1, String topping2,
                 String topping3, String size) {
        this(topping1, topping2, topping3, size, "Classic Crust");
    }


    public Pizza(String topping1, String topping2) {
        this(topping1, topping2, "");
    }

    public Pizza(String topping1) {


        this(topping1, "", "");
    }


}
