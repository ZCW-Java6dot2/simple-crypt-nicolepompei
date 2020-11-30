public class Caesar extends ROT13 {
    private int caesarShift;

    public Caesar(int caesarShift) {
        this.caesarShift = caesarShift;
    }

    public String caesarEncrypt(String text) {
        char[] textToChars = text.toCharArray();
        int index = 0;

        for (char c : textToChars) {
            if (c >= 65 && c <= 90) {
                c %= 65;
                c += caesarShift;
                c %= 26;
                c += 65;
            } else if (c >= 97 && c <= 122) {
                c %= 97;
                c += caesarShift;
                c %= 26;
                c += 97;
            }
            textToChars[index++] = c;
        }

        return new String(textToChars);
    }


    public String caesarDecrypt(String text) {
        char[] textToChars = text.toCharArray();
        int decryptShift = 26 - caesarShift;
        int index = 0;


            for (char c : textToChars) {
                if (c >= 65 && c <= 90) {
                    c %= 65;
                    c += decryptShift;
                    c %= 26;
                    c += 65;
                } else if (c >= 97 && c <= 122) {
                    c %= 97;
                    c += decryptShift;
                    c %= 26;
                    c += 97;
                }
                textToChars[index++] = c;
            }
    return new String(textToChars);
    }

}




