import java.util.*;

public class p7_17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        if (name.equals("Undergraduate")) {
            Undergaduate un = new Undergaduate();
            int num = scan.nextInt();
            System.out.println("课程等级为：" + un.level(num));
        } else {
            Postgraduate post = new Postgraduate();
            int num = scan.nextInt();
            System.out.println("课程等级为：" + post.level(num));
        }
        scan.close();
    }

    static boolean in(int num, int a, int b) {
        if (num >= a && num <= b)
            return true;
        else
            return false;
    }

    static String[] level = new String[] { "优秀", "良好", "一般", "及格", "不及格" };

    abstract static class Student {

        abstract String level(int grade);
    }

    static class Undergaduate extends Student {
        int[] min = new int[] { 80, 70, 60, 50 };
        int[] max = new int[] { 100, 80, 70, 60 };

        @Override
        String level(int grade) {
            // TODO Auto-generated method stub
            for (int i = 0; i < 4; i++) {
                if (in(grade, min[i], max[i])) {
                    return level[i];
                }
            }
            return level[4];
        }
    }

    static class Postgraduate extends Student {
        int[] min = new int[] { 90, 80, 70, 60 };
        int[] max = new int[] { 100, 90, 80, 70 };

        @Override
        String level(int grade) {
            // TODO Auto-generated method stub
            for (int i = 0; i < 4; i++) {
                if (in(grade, min[i], max[i])) {
                    return level[i];
                }
            }
            return level[4];
        }
    }
}