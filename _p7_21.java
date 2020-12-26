import java.util.HashSet;
import java.util.Scanner;

public class _p7_21 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String tmp = scan.next();

            if (!scan.hasNext()) {
                if (set.contains(tmp)) {
                    set.remove(tmp);
                    System.out.println("删除成功：" + tmp);
                } else {
                    System.out.println("没有找到此人：" + tmp);
                }
            } else {
                set.add(tmp);
            }
        }

    }
}
