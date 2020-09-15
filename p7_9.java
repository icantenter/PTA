import java.util.*;


public class p7_9 {
    public static void main(final String[] args) {
        final boolean[] array = new boolean[101];
        final Scanner scan = new Scanner(System.in);
        int number, out = 0, cur = 0, counter = 0;

        Arrays.fill(array, true);
        number = scan.nextInt();
        while (true){
            if (cur == number)
                cur = 0;// 数组模拟环状，最后一个与第一个相连
            if (array[cur])
                counter++;// 第t个位置上有人则报数
            if (counter == 3)// 当前报的数是m
            {
                counter = 0;// 计数器清零
                array[cur] = false;// 此处人已死，设置为空
                out++;// 死亡人数+1
                if (out == number) { 
                    System.out.println("原排在第" + (cur + 1) + "位的人留下了。");
                    break;
                }
            }
            cur++;// 逐个枚举圈中的所有位置
        } // 直到所有人都被杀死为止
        scan.close();
    }
}
//模拟 优先级 9
// java 数组填充Array.fill(arrayname, value)
// https://www.runoob.com/java/arrays-fill.html