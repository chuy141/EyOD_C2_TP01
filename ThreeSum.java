import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        Arrays.sort(nums);

        List<String> respuestas = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int izquierda = i + 1, derecha = n - 1;
            while (izquierda < derecha) {
                int suma = nums[i] + nums[izquierda] + nums[derecha];
                if (suma == 0) {
                    respuestas.add(nums[i] + " " + nums[izquierda] + " " + nums[derecha]);
                    int a = nums[izquierda], b = nums[derecha];
                    while (izquierda < derecha && nums[izquierda] == a) izquierda++;
                    while (izquierda < derecha && nums[derecha] == b) derecha--;
                } else if (suma < 0) izquierda++;
                else derecha--;
            }
        }

        if (respuestas.isEmpty()) System.out.println("sin soluciones");
        else for (String tripleta : respuestas) System.out.println(tripleta);
    }
}
