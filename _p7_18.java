import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _p7_18 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String tmp = scan.nextLine();
        for (Character c : tmp.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else
                map.put(c, 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        // System.out.println(map.toString());
    }
}
