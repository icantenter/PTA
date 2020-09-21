import java.util.*;

public class p7_28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Character> set = new LinkedHashSet<>();//注释1
        String source;

        source = scan.nextLine();
        for (char ch : source.toCharArray()) {
            set.add(ch);//注释2
        }
        // 注释3
        System.out.println(set.toString());
        scan.close();

    }
}
//优先级 9

/*
1. HashSet和LinkedHashSet区别
https://www.cnblogs.com/Terry-greener/archive/2011/12/02/2271707.html
*/

/*
2. set不允许相同元素
*/