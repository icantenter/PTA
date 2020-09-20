import java.util.*;

public class p7_3 {
    
    static int foo(int a) {
        if (a == 1)
            return 1;
        return a * foo(a - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("5! = " + foo(5));
    }

    
}

// 递归
// java 里函数叫方法
// 静态修饰成员变量与方法时，可以用类名或者对象进行访问
// 非静态修饰成员变量与方法时，只能用对象进行访问 
// https://www.cnblogs.com/Strongzzz/p/10650541.html
// 优先级4