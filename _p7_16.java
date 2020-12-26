import java.util.HashMap;
import java.util.Scanner;

public class _p7_16 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("apple","苹果");
        map.put("banana","香蕉");
        map.put("water","水");
        map.put("pen","笔");
        map.put("phone","手机");
        Scanner scan = new Scanner(System.in);
        String tmp = scan.next();
        if (tmp.equals("")) {
            System.out.println("请输入要查询的单词！");
            return ;
        }
        if (map.containsKey(tmp))
        {
            System.out.println("翻译结果为：" + map.get(tmp));
        }
        else
        {
            System.out.println("要查询的单词不存在！");
        }
    }
}
