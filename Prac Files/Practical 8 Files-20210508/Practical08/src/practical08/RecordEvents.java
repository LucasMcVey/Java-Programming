package practical08;

// Program to record the times at which events occur at a number of
// locations. No continunity or error checking is performed.

//RecordEvents creates a single recorder, records 2 events
// and prints out the complete list of events
public class RecordEvents {

    public static void main(String args[]) {
       RecordEvents recordEvents = new RecordEvents();
       recordEvents.task4();
    }

    public void task4() {
        Recorder r1 = new Recorder(100,100,"Wombat Detection");
        r1.recordEvent( "10.53",20);
        r1.recordEvent( "10.59 ",20);
        r1.recordEvent( "11.05",20);
        r1.recordEvent( "12.59",10);
        r1.recordEvent( "13.5",10);
        r1.recordEvent( "14.06",10);
        r1.printEvents();
    }



}
