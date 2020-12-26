import java.util.HashSet;
import java.util.Scanner;

public class _p7_19 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        String[] tmp = {"aaa","bbb","ccc","ddd"};
        for (String s : tmp) {
            set.add(s);
        }
        for (String string : set) {
            System.out.println(string);
        }   
    }
}
