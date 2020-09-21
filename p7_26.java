import java.util.*;

public class p7_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[26];
        String source;
        int k;

        Arrays.fill(nums, 0);
        source = scan.next();
        k = scan.nextInt();
        for (char i : source.toCharArray()) {
            nums[i - 'a']++;
        }
        while (k != 0) {
            int max = 0;
            for (int i = 0; i < 26; i++) {
                if (nums[max] < nums[i]) {
                    max = i;
                }
            }
            if (nums[max] > 0)
                nums[max]--;
            k--;
        }
        int ans = 0;
        for (int i : nums) {
            ans += i * i;
        }
        System.out.println(ans);
        scan.close();
    }
}