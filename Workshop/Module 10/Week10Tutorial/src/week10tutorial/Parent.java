package week10tutorial;


/**
 *
 * @author Carl
 */
public class Parent {

    private int a;
    private int b;
    
    public Parent() {
        System.out.println("This is the parent default constructor");
    }
    
    public Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
