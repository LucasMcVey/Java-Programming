package Testing.Drill6;

import java.lang.Math;


public class convertLength {
    public double convertLength(double length, boolean toMetric) {

        if (toMetric)
        {
            length = length * 25.4;
            double test = Math.round(length * 100.0) / 100.0;
            length = test;
            return length;
        }
        else
           length = length * 0.0394;
           double test = Math.round(length * 100.0) / 100.0;
           length = test;
           return length;




        }

    }







