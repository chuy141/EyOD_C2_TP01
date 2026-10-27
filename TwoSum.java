import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int target = sc.nextInt();

        Map<Integer, Integer> vistos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int complemento = target - nums[i];
            if (vistos.containsKey(complemento)) {
                System.out.println(vistos.get(complemento) + " " + i);
                return;
            }
            vistos.put(nums[i], i);
        }
        System.out.println("-1 -1");
    }
}
