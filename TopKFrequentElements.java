import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int k = sc.nextInt();

        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int x : nums) frecuencia.put(x, frecuencia.getOrDefault(x, 0) + 1);

        List<Integer> valores = new ArrayList<>(frecuencia.keySet());
        valores.sort((a, b) -> {
            int cmp = Integer.compare(frecuencia.get(b), frecuencia.get(a));
            return cmp != 0 ? cmp : Integer.compare(a, b);
        });

        k = Math.min(k, valores.size());
        for (int i = 0; i < k; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(valores.get(i));
        }
        System.out.println();
    }
}
