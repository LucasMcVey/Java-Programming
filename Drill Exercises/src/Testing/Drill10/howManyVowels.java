package Testing.Drill10;



public class howManyVowels {
    public static void main(String[] args) {
        howManyVowels howmanyvowel = new howManyVowels();
        String sentence = "Ggurte iaibp p Utm m qjn ouoho";
        System.out.println(howManyVowels(sentence));
    }
     public static String howManyVowels(String sentence) {
         int[] vowelCount = { 0, 0, 0, 0, 0};

         int other = sentence.replaceAll("[^bcdfghjklnmpqrstvwxyzBCDFGHJKLNMPQRSTUVWXYZ]", "" ).length();
         int spaces = sentence.replaceAll("[^ ]", "").length();


         for( int i = 0; i < sentence.length(); i++ ) {
             if( sentence.charAt(i) == 'a') {
                 vowelCount[0]++;
             }
             if( sentence.charAt(i) == 'e') {
                 vowelCount[1]++;
             }
             if( sentence.charAt(i) == 'i') {
                 vowelCount[2]++;
             }
             if( sentence.charAt(i) == 'o') {
                 vowelCount[3]++;
             }
             if( sentence.charAt(i) == 'u') {
                 vowelCount[4]++;
             }

         }

         other = other + spaces;

         System.out.println("Number of each lowercase vowel in the string:  ");
         System.out.println("a: " + vowelCount[0]);
         System.out.println("e: " + vowelCount[1]);
         System.out.println("i: " + vowelCount[2]);
         System.out.println("o: " + vowelCount[3]);
         System.out.println("u: " + vowelCount[4]);
         System.out.println("other characters: " + other);


         sentence ="";
         return sentence;



     }

}
