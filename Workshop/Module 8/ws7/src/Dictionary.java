public class Dictionary {
    static String[][] dict =
        {
            {"aardvark", "burrowing African mammal"},
            {"acrobat", "performer of dangerous aerial tricks"},
            {"adamantine", "rigid, firm, unyielding"},
            {"agate", "colourful rock formation used ornamentally"},
            {"antipathy", "deep dislike"},
            {"astrolabe", "ancient astronomical model of the universe"}
        };

    public static void lookup(String word) {
        int location = 0;
        while (location < dict.length &&
                !word.equals(dict[location][0])) {
            location++;
        }
        if (location == dict.length) {
            System.out.println(word + " is not in the dictionary.");
        }
        else {
            System.out.println(word + " means: " +
                    dict[location][1]);
        }
    }


    public static void main(String[] args) {
        lookup("adamantine");
        lookup("aquatic");
    }
}
