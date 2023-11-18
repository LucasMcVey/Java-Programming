public class Ciphers {
    static char[] alphabet =
        {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

    static char key = 'b';

    static char[] encode(String message) {
        char[] messageChars = message.toLowerCase().toCharArray();
        char[] encodedChars = new char[messageChars.length];
        int offset = key - 'a';
        for (int i = 0; i < encodedChars.length; i++) {
            int pos = (messageChars[i] - 'a' + offset) % 26;
            encodedChars[i] = alphabet[pos];
        }
        return encodedChars;
    }

    public static void main(String[] args) {
        System.out.println(new String(encode("themessage")));
    }
}
