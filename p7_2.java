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
//优先级7
//此题的规律是斐波拉契变体。
//下一个分数的分子 = 等于当前分数的分子和分母的相加
//下一个分数的分子 = 等于当前分数的分子
