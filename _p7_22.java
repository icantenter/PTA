import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class _p7_22 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String tmp = scan.next();
        for (char c : tmp.toCharArray()) {
            list.add(c);
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.toString());
    }
}
