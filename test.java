import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap map = new TreeMap();
        String source;

        source = scan.nextLine();
        for (char ch : source.toCharArray()) {
            map
        }
        //注释1
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {

            Map.Entry entry = (Map.Entry) iter.next();

            String key = (String) entry.getKey();

            // 获取value

            String value = (String) entry.getValue();
            System.out.println(key + "---" + value);
        }
        scan.close();

    }
    }
}