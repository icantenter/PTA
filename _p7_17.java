import java.util.HashMap;
import java.util.Scanner;

public class _p7_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        while (scan.hasNext()) {
            String tmp = scan.next();
            if (!scan.hasNext()) {
                if (map.containsKey(tmp)) {
                    System.out.print(tmp + "的成绩为：" + map.get(tmp));
                } else {
                    System.out.print("没有找到此人：" + tmp);
                }
            } else {
                map.put(tmp, scan.nextInt());
            }
        }
        scan.close();
    }
}
