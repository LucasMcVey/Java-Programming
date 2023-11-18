package practical08;

// A Recorder object can store up to 5 events
// The time of each event is stored as a string
// The constructor receives the coordinates of the recorder and the name
// of the event type as parameters

public class Recorder {

    int xPos, yPos;
    String eventType;
    private final int EVENT_MAX = 10;
    EventInformation[] event = new EventInformation[EVENT_MAX];
    int xevent = 0;

    Recorder(int xPos, int yPos, String eventType) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.eventType = eventType;
    }

    void recordEvent(String eventTime, int datum) {
        if (xevent == EVENT_MAX) {
            System.out.println("Event log overflow - terminating");
            System.exit(1);
        }
        EventInformation e = new EventInformation(eventTime, datum);
        event[xevent] = e;
        xevent++;

    }

    void printEvents() {
        System.out.println("Record of " + eventType + " events at [" + xPos + ", " + yPos + "] ");
        for (int i = 0; i < xevent; i++) {
            System.out.println("Event number " + i + " was recorded at " + event[i].eventTime + " with datum = " + event[i].eventDatum);
        }
    }

    class EventInformation {
        String eventTime;
        int eventDatum;

        EventInformation(String eventTime, int eventDatum) {
            this.eventTime = eventTime;
            this.eventDatum = eventDatum;
        }


    }
}
