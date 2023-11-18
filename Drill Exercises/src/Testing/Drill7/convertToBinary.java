package Testing.Drill7;

public class convertToBinary {

    public static void main(String[] args) {
        convertToBinary converttobinary = new convertToBinary();
        System.out.println(convertToBinary(165));
    }
    public static String convertToBinary(int decimal) {
        String bin = Integer.toBinaryString(decimal);
        String s2 = "";
        int length = bin.length();
        if (length == 6)
        {
             s2 = "00" + bin;
        }
        if (length == 7)
        {
            s2 = "0" + bin;
        }
        if (length == 5)
        {
            s2 = "000" + bin;
        }
        if (length == 8)
        {
            s2 = "" + bin;
        }

        return s2;

    }
}
