import java.util.Scanner;

public class p7_21 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        String[] nums = temp.split(",");//注释1
        for (String num : nums) {
            counter++;
        }
        int index = scan.nextInt();
        if (index >= counter)
            System.out.println("下标越界！");
        else
            System.out.println(Integer.parseInt(nums[index]));
    }
}
//优先度 8

/*
1.字符串分割
Stirng.split() 
https://blog.csdn.net/xuan971130/article/details/79842896
*/