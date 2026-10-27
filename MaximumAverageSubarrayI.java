import java.util.*;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int k = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println("k invalido");
            return;
        }

        long suma = 0;
        for (int i = 0; i < k; i++) suma += nums[i];
        long mayorSuma = suma;

        for (int i = k; i < n; i++) {
            suma += nums[i] - nums[i - k];
            mayorSuma = Math.max(mayorSuma, suma);
        }
        System.out.printf(Locale.US, "%.5f%n", (double) mayorSuma / k);
    }
}
