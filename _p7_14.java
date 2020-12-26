import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class _p7_14 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int count = 1;
        for (Character i : scan.next().toCharArray()) {
            if (!map.containsKey(i)) {
                map.put(i, count++);
                System.out.print(i);
            }
        }
    }
}
