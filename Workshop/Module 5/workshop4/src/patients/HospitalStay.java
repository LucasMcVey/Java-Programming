package patients;

public class HospitalStay {
    private Patient patient;
    private String admissionDate;

    public HospitalStay(Patient p, String ad) {
        patient = p;
        admissionDate = ad;
    }

    public String getDescription() {
        String s = "";
        s += ("Patient: " + patient.getFullName() + "\n");
        s += ("Admission Date: " + admissionDate + "\n");
        return s;
    }
}
