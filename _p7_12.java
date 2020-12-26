import java.util.*;

public class _p7_12 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String tmp = scan.next();
            if (tmp.equals("end")) {
                break;
            } else {
                try {
                    list.add(Integer.parseInt(tmp));
                } catch (Exception e) {
                    System.out.println("输入了非数字，数字格式转换异常");
                    break;
                }
            }

        }
        if (list.size() == 0) {
            System.out.println("无数据输入");
            
        }
        else
        {
            System.out.println("最大值为" + Collections.max(list) + "，索引号为" + list.indexOf(Collections.max(list)));
        }

    }
}
