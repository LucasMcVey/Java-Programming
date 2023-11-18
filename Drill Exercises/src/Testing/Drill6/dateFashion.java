package Testing.Drill6;

public class dateFashion {
    public int dateFashion(int you, int date) {

        if (date < 3)
            if (you < 3)
            {
                return you = 0;
            }
        if (date > 8)
            if (you > 8)
            {
                return you = 0;
            }
        if (you > 8)
            if (date < 3)
            {
                return you = 0;
            }
        if (date > 8)
            if (you < 3)
            {
                return you = 0;
            }
        if (you <= 2)
            if (date > 3)
            {
                return you = 0;
            }
        if (date <= 2)
            if (you > 3)
            {
                return you = 0;
            }
        if (you > 2)
            if (you < 8)
                if (date > 8)
                {
                    return you = 2;
                }
        if (date > 2)
            if (date < 8)
                if (you > 8)
                {
                    return you = 2;
                }
      else
          return you = 1;
          return date = 1;

    }

}





