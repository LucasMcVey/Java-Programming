package practical05;

public class Frog {

    private String name = "Name_not_set";
    private int id = -1; // -1 used to indicates it has not been set
    private int age = 0;

    public Frog(String theName, int theId, int theAge) {
        name = theName;
        id = theId;
        age = theAge;
    }

    public void reversedName()
    {

        char [] actualNameChar = name.toCharArray();

        char [] updatedCharArr = new char[actualNameChar.length];

        for (int i = 0; i < actualNameChar.length; i++)
        {
            char ch = actualNameChar[i];
            char replaceByChar = ch;
            switch (ch)
            {
                case 'a':
                case 'n':
                    replaceByChar = 'i'; break;
                case 'r':
                case 'F':
                    replaceByChar = 'o'; break;
            }
            updatedCharArr[i] = replaceByChar;
        }
        String updatedName = String.valueOf(updatedCharArr);
        System.out.println(updatedName);
    }

    void printAgeGroup () {
        if (age >= 0)
            if (age <= 20)
            {
                System.out.println("Age group is young");
            }

            else
            if (age <= 50)
            {
            System.out.println("Age group is juvenile");
            }

        else
            System.out.println("Age group is adult");
    }

    void print() {
        System.out.println("**** Start of print method ******");
        System.out.println("Frog's name is " + name);
        System.out.println("Id is " + id);

    }
}
