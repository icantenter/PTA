import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class _p7_11 {
    public static void main(String[] args) {
        TreeMap<Character,ArrayList<Integer>> map = new TreeMap<>();
        Scanner scan = new Scanner(System.in);
        String tmp = scan.nextLine();
        int count = 0; 
        for (Character i : tmp.toCharArray())
        {
            if (map.containsKey(i))
                map.get(i).add(count);
            else
            {
                map.put(i,new ArrayList<Integer>());
                map.get(i).add(count);
            }
            count++;
        }
        
        System.out.println(map.toString());
    }
}
