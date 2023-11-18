public class Calendar {
    private CalendarEntry[][] entries = new CalendarEntry[7][24];

    public static String getTime(int day, int hour) {
        return "TBD";
    }

    public void addEntry(int day, int hour, String desc, String[] invitees) {
        CalendarEntry ce = new CalendarEntry(desc, invitees);
        entries[day][hour] = ce;
    }

    public String displayEntry(int day, int hour) {
        String ret = "";
        CalendarEntry ce = entries[day][hour];
        if (ce != null) {
            ret = getDayDesc(day) + ", " + getHourDesc(hour) + " - " +
                    ce.getDetails();
        }

        return ret;
    }

    public String getDayDesc(int day) {
        return "Day " + day;
    }

    public String getHourDesc(int hour) {
        return hour + ":00";
    }

    public void displayEntriesForDay(int day) {
        for (int hour = 0; hour < 24; hour++) {
            System.out.println(displayEntry(day, hour));
        }
    }

    public static void main(String[] args) {
        Calendar c = new Calendar();

        String[] ii1 = {"Bob", "Janet"};
        String[] ii2 = {};

        c.addEntry(2, 12, "Group meeting", ii1);
        c.addEntry(2, 14, "Roundtable discussion", ii2);

        c.displayEntriesForDay(2);
    }
}
