import java.util.Scanner;
import java.lang.*;
public class p7_23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();  
        float b = scan.nextFloat();
        if (b == 0)
            System.out.println("除数不能为0");
        else
            System.out.println(a / b);
        scan.close();
    }
}
//优先级4
/*
1.这道题要用float
*/