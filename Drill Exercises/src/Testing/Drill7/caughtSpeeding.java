package Testing.Drill7;

public class caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {


        if (isBirthday)
            speed -= 5;
        if (speed <= 60)
            return 0;
        return (speed > 60 && speed <= 80) ? 1 : 2;


    }

}





