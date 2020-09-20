import java.util.*;
public class p7_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0, ans = 0;
        try {
            a = Integer.parseInt(scan.next());
            b = Integer.parseInt(scan.next());
            try {
                ans = a / b;
                System.out.println(ans);
            } catch (ArithmeticException e) {
                //TODO: handle exception
                System.out.println(e);
                
            }
        } catch (NumberFormatException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        
        
        System.out.println("总会被执行！");
        scan.close();
    }
}