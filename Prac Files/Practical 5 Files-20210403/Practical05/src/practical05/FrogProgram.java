package practical05;

public class FrogProgram {

    public static void main(String[] args) {
        Frog myFrog = new Frog("Fred", 1000, 22);  // create a Frog object
        myFrog.print();
        myFrog.printAgeGroup();

        Frog myFrog2 = new Frog("Fran", 1001, 75);  // create a Frog object
        myFrog2.print();
        myFrog2.printAgeGroup();
        myFrog.reversedName();
        myFrog2.reversedName();
    }
}

