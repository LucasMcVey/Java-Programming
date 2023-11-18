package practical04;

/**
 *
 * @author
 */
public class Boat {
    private int regNum = -1;
    private String bClass = "unknown";
    private String name = "unknown";
    private final double yardstick = 95.0;

    public String getName() {
        return name;
    }
    public String setName(String n) {
        name = n;
        return name;
    }
    public String setbClass(String n) {
        bClass = n;
        return bClass;
    }
    public int setregNum(int n) {
        regNum = n;
        return regNum;
    }
    
    public void print() {
        System.out.println("Boat " + name + ", Class = " + bClass + ", Registration # = KA " + regNum);
    }
    // instance variable and method
    // declarations ...
}
