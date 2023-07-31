import java.util.*;
import edu.duke.*;

public class VigenereBreaker {
    public String sliceString(String message, int whichSlice, int totalSlices) {
        StringBuilder messageBuilder = new StringBuilder(message);
        StringBuilder newString = new StringBuilder();
        for (int i = whichSlice; i < message.length(); i += totalSlices) {
            newString.append(messageBuilder.charAt(i));
        }
        return newString.toString();
    }

    public int[] tryKeyLength(String encrypted, int klength, char mostCommon) {
        CaesarCracker cc = new CaesarCracker(mostCommon);
        int[] key = new int[klength];
        for (int i = 0; i < klength; i++) {
            String msgPart = sliceString(encrypted, i, klength);
            int keyPart = cc.getKey(msgPart);
            key[i] = keyPart;
        }
        return key;
    }

    public void breakVigenere () {
        FileResource fr = new FileResource();
        String message = fr.asString();
        int[] key = tryKeyLength(message, 5, 'e');
        for (int i = 0; i < key.length; i++) {
            System.out.print(key[i] + " ");
        }
        System.out.println();
        VigenereCipher vc = new VigenereCipher(key);
        String decrypted = vc.decrypt(message);
        System.out.println(decrypted);
    }
}
