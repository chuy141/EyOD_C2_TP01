import java.util.*;

public class TwoSumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int target = sc.nextInt();

        int izquierda = 0, derecha = n - 1;
        while (izquierda < derecha) {
            int suma = nums[izquierda] + nums[derecha];
            if (suma == target) {
                System.out.println((izquierda + 1) + " " + (derecha + 1));
                return;
            } else if (suma < target) {
                izquierda++;
            } else {
                derecha--;
            }
        }
        System.out.println("-1 -1");
    }
}
