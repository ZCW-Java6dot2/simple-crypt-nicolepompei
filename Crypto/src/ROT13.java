import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13 {
    private Character cs;
    private Character cf;

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }

    ROT13() {
        cs = 'a';
        cf = 'n';
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder cryptedString = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'm') {
                c += 13;
            } else if (c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if (c >= 'N' && c <= 'Z') {
                c -= 13;
            }
            cryptedString.append(c);
        }
        return (cryptedString.toString());
    }

    public String encrypt(String text) {
       return crypt(text);

    }

    public String decrypt(String text) {
       return crypt(text);
    }

    public static String rotate(String s, Character c) {
        Integer startRotateIndex = 0;
        char[] stringAsChars = s.toCharArray();
        String rotatedString = "";

        //find index of character to start rotation

        for (int i = 0; i < stringAsChars.length; i++) {
            if (stringAsChars[i] == c) {
                startRotateIndex = i;
            }
        }
        //fill first half of string with last bit of array
        for (int i = startRotateIndex; i < stringAsChars.length; i++) {
            rotatedString = rotatedString + stringAsChars[i];
        }

        //fill last half of string with first bit of array
        for (int i = 0; i < startRotateIndex; i++) {
            rotatedString = rotatedString + stringAsChars[i];
        }

        return rotatedString;
    }

}





