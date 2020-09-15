import java.util.*;
public class p7_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int a = 2, b = 1;
        float sum = 0;
        num = scan.nextInt();

        for (int i = 0; i < num; i++)
        {
            sum += (float)a / b;
            int temp = a;
            a += b;
            b = temp;
        }
        System.out.println(sum);
        scan.close();
    }

}