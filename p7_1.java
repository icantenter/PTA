import java.util.*;

public class p7_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, max;
        a = scan.nextInt();
        b = scan.nextInt();

        max = _gcd(a, b);
        System.out.println("最大公约数:" + max + "\n最小公倍数:" + (a * b) / max);
        scan.close();
    }

    private static int _gcd(int a, int b) {
        //a % b得到余数
        if (a % b == 0)
            return b;
        return _gcd(b, a % b);
    }
}
//优先级6
//Scanner类 https://www.runoob.com/java/java-scanner-class.html
//函数_gcd原理 https://baike.baidu.com/item/最大公约数/869308?fr=aladdin
