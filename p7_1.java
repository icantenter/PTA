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
        if (a % b == 0)
            return b;
        return _gcd(b, a % b);
    }
}
