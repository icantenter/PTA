import java.nio.charset.CharacterCodingException;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class p7_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] low_ch = new int[26];
        int[] up_ch = new int[26];
        int space = 0;
        String source;
        Arrays.fill(low_ch, 0);
        Arrays.fill(up_ch, 0);

        source = scan.nextLine();
        for (char ch : source.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                up_ch[ch - 'A']++;
            } else if (Character.isLowerCase(ch)) {
                low_ch[ch - 'a']++;
            } else {
                space++;
            }
        }
        System.out.println(" =" + space);
        for (int i = 0; i < 26; i++) {
            if (low_ch[i] != 0) {

                System.out.println((char) (i + 'a') + "=" + low_ch[i]);
            }
            if (up_ch[i] != 0) {
                System.out.println((char) (i + 'A') + "=" + up_ch[i]);
            }
        }
        scan.close();
    }
}