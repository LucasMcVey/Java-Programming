package patients;

public class Patient {
    private String familyName = "";
    private String firstName = "";

    private String dateOfBirth;

    public Patient(String famName, String frstName, String dob) {
        familyName = famName;
        firstName = frstName;
        dateOfBirth = dob;
    }

    public String getFullName() {
        String s = firstName;
        if (!familyName.equals("")) {
            s += (" " + familyName);
        }
        return s;
    }

}
