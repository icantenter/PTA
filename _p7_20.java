import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class _p7_20 {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<Character>();
        ArrayList<Character> list = new ArrayList<Character>();
        
        Scanner scan = new Scanner(System.in);
        String tmp = scan.next();
        for (Character C: tmp.toCharArray())
        {
            if (!set.contains(C))
            {
                set.add(C);
                list.add(C);
            }
        }
        System.out.println(list.toString());
        // System.out.println(sb.toString());
    }
}
