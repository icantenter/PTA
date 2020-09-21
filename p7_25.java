import java.util.*;

public class p7_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap map = new TreeMap();
        String number;
        String name;
        while (scan.hasNext()) {
            name = scan.next();
            number = scan.next();
            map.put(name, number);
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
// 优先级9
/*
1. Treemap的遍历方式
https://blog.csdn.net/Ella7/article/details/81193496
*/