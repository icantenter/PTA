import java.util.*;

public class p7_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0, ans = 0;
        try {
            a = scan.nextInt();
            b = scan.nextInt();
            ans = a / b;
            System.out.println(ans);

        } catch (InputMismatchException e) {
            System.out.println("请输入整型数！");
        }
        catch (ArithmeticException e)
        {
            System.out.println("除数不可为0！");
        }
        finally {
            System.out.println("总会被执行！");
        }
        scan.close();
    }
}
// 优先度8

/*
 * 1.异常抛出 https://www.runoob.com/java/java-exceptions.html
 */