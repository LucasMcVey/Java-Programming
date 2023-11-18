package Testing.Drill6;

public class loveSix {
    public boolean loveSix(int a, int b) {

        if (a == 6)
        {
            return true;
        }
        if (b == 6)
        {
            return true;
        }

        if (a + b == 6)
        {
            return true;
        }
        if (a - b == 6)
        {
            return true;
        }
        if (b - a == 6)
        {
            return true;
        }

        else return false;

    }
}
