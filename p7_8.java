import java.util.Scanner;

public class p7_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        number = number.substring(number.length() - 7, number.length() - 3);
        System.out.println("截取从右端开始的4～7位是：" + number);
        scan.close();
    }

}