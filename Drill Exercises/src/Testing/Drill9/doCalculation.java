package Testing.Drill9;

import java.lang.Math;

public class doCalculation {
    public static void main(String[] args) {
        doCalculation docalculation = new doCalculation();
        double num1 = 252.08, num2 = 58.39;
        char c = '%';
        System.out.println("The value of the calculation is: " + doCalculation(num1, num2, c));

    }

    public static double doCalculation(double num1, double num2, char c) {
        double calc = 0;

        if (c == '+')
        {
            {
                calc = (num1+num2);
            }
        return calc;
        }

        else if (c == '-')
         {
            if (num1>num2)
         {
            calc = (num1-num2);
         }
            else
         {
            calc = (num2-num1);
         }
            return (calc);
         }


        else if (c == '*')
        {
            {
            calc = (num1*num2);
            calc = Math.round(calc * 100.0) / 100.0;

            }
            return (calc);
        }


       else if (c == '/')
        {
            if (num2>0)
            {
              calc = (num1/num2);
            }
            else
            {
              calc = 0;
            }
              return (calc);
        }

      else if (c == '%')
        {
            {
                calc = (num1%num2);
                calc = Math.round(calc * 100.0) / 100.0;

            }
            return (calc);
        }

          return calc;

    }
}
