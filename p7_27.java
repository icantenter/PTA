import java.util.*;

public class p7_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String source;

        source = scan.nextLine();
        for (char ch : source.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);//注释1
        }
        // 注释1
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {

            Map.Entry entry = (Map.Entry) iter.next();

            char key = (char) entry.getKey();

            // 获取value

            int value = (int) entry.getValue();
            System.out.println(key + "=" + value);
        }
        scan.close();

    }
}
//这道要用HashMap
