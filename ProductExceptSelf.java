import java.util.*;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int prefijo = 1;
        for (int i = 0; i < n; i++) {
            resultado[i] = prefijo;
            prefijo *= nums[i];
        }

        int sufijo = 1;
        for (int i = n - 1; i >= 0; i--) {
            resultado[i] *= sufijo;
            sufijo *= nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(resultado[i]);
        }
        System.out.println();
    }
}
