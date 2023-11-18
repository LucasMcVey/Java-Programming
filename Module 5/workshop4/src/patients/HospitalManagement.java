package patients;

public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient("SquarePants", "SpongeBob", "1 June 2000");
        Patient p2 = new Patient("Incredible", "Jack-Jack", "1 July 2010");

//        System.out.println(p1.getFullName());

        HospitalStay hs1 = new HospitalStay(p2, "30 March 2021");
        System.out.println(hs1.getDescription());
    }
}
