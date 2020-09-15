import java.util.*;
public class p7_3 {
    public static void main(String[] args) {
        System.out.println("5! = " + foo(5));
    }

    private static int foo(int a)
    {
        if (a == 1)
            return 1;
        return a * foo(a - 1);
    }
}