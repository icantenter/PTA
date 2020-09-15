import java.util.Scanner;

public class p7_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String num;
        num = scan.next();
        for (int i = 0; i < 2; i++) {
            char a = (char) num.charAt(i);
            char b = (char) num.charAt(4 - i);
            if (a != b) {
                System.out.println("这不是一个回文数");
                return ;
            }
        }
        System.out.println("这是一个回文数");
        scan.close();
    }
}