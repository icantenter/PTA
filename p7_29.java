import java.util.*;

public class p7_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp = scan.next();
        ArrayList<Character> list = new ArrayList<>();
        for (Character ch : temp.toCharArray()) {
            list.add(ch);
        }
        Collections.sort(list);
        System.out.println(list);
        scan.close();
    }
}