import java.util.*;

public class p7_18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        if (name.equals("Ordinary")) {
            Ordinary un = new Ordinary();
            int num = scan.nextInt();
            System.out.println("对应职位为：" + un.level(num));
        } else {
            College post = new College();
            int num = scan.nextInt();
            System.out.println("对应职位为：" + post.level(num));
        }
        scan.close();
    }

    static boolean in(int num, int a, int b) {
        if (num >= a && num <= b)
            return true;
        else
            return false;
    }

    static String[] level = new String[] { "教授", "副教授", "讲师", "安保", "其他" };

    abstract static class School {

        abstract String level(int grade);
    }

    static class Ordinary extends School {
        int[] min = new int[] { 8000, 7000, 6000, 5000 };
        int[] max = new int[] { 10000, 8000, 7000, 6000 };

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

    static class College extends School {
        int[] min = new int[] { 9000, 8000, 7000, 6000 };
        int[] max = new int[] { 10000, 9000, 8000, 7000 };

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

//优先级8
/*
1.用列表查找
*/