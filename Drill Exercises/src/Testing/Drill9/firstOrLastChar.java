package Testing.Drill9;

public class firstOrLastChar {
    public String firstOrLastChar(String str) {
        int len = str.length();
        if(len > 4)
            return str.substring(0,1);
        if(len > 2)
            if(len <= 3)
            return str.substring(2);
        if(len > 1)
            if(len <=2)
            return  str.substring(1);

        return str.substring(0,1);

    }

}
