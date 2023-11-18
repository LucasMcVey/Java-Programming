package practical04;

/**
 *
 * @author
 */
public class BoatMaker {

    public static void main(String[] args) {
        Boat myBoat1 = new Boat();
        System.out.println("Starting boat application");
        myBoat1.print();
        Boat myBoat2 = new Boat();
        myBoat2.setName("Harmony Blue");
        myBoat2.setbClass("International 505");
        myBoat2.setregNum(6467);
        myBoat2.print();

        myBoat1.setName("Australia II");
        myBoat1.print();
        System.out.println(myBoat1.getName());
        System.out.println(myBoat2.getName());

        // statements ...
    }
}
