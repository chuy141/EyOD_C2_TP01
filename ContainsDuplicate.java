import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> vistos = new HashSet<>();
        boolean duplicado = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (!vistos.add(x)) duplicado = true;
        }
        System.out.println(duplicado ? "true" : "false");
    }
}
