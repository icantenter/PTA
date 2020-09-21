import java.util.Scanner;

public class p7_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        number = number.substring//注释1
            (number.length() - 7, number.length() - 3);
        System.out.println("截取从右端开始的4～7位是：" + number);
        scan.close();
    }

}
//优先级8

/*
1. 截取字符串的两种substring方法
public String substring(int begin, int end)
public String substring(int begin)
*/