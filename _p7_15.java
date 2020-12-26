import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class _p7_15 {
    public static void main(String[] args) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        for (Character i : scan.nextLine().toCharArray())
        {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        int n = scan.nextInt();
        for (int i = 0; i < n; i++)
        {
            int tmp = Collections.max(list);
            list.set(list.indexOf(tmp), tmp - 1);
        }
        int ans = 0;
        for (Integer i : list) {
            ans += i * i;
        }
        System.out.println(ans);

        
    }
}
