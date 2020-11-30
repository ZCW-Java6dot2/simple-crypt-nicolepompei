import org.junit.Assert;
import org.junit.Test;

public class CaesarTest {


    @Test
    public void caesarCryptTestShift3(){
        Caesar caesar = new Caesar(3);

        String originalString = "Hello world!";

        String expected = "Khoor zruog!";

        String actual = caesar.caesarEncrypt(originalString);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void caesarDecryptTest(){
        Caesar caesar = new Caesar(3);

        String actual = "Hello world!";

        String encryptedString = caesar.caesarEncrypt(actual);

        String expected = caesar.caesarDecrypt(encryptedString);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void caesarEncryptTestShift13(){
        Caesar caesar = new Caesar(13);

        String originalString = "Hello world!";

        String expected = "Uryyb jbeyq!";
        String actual = caesar.caesarEncrypt(originalString);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void caesarDecryptTestShift13(){
        Caesar caesar = new Caesar(13);

        String actual = "Hello world!";

        String encryptedString = caesar.caesarEncrypt(actual);
        String expected = caesar.caesarDecrypt(encryptedString);

        Assert.assertEquals(expected, actual);
    }

}
