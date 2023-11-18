public class CalendarEntry {
    private String description;
    private String[] invitees;

    public CalendarEntry(String description, String[] invitees) {
        this.description = description;
        this.invitees = invitees;
    }

    public String getDetails() {
        return description + "(" + getInviteesString() + ")";
    }

    public String getInviteesString() {
        return "Invitees";  // TBD
    }
}
