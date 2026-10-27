import java.util.*;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println(0);
            return;
        }

        int minimo = Integer.MAX_VALUE;
        int mejorGanancia = 0;
        for (int i = 0; i < n; i++) {
            int precio = sc.nextInt();
            minimo = Math.min(minimo, precio);
            mejorGanancia = Math.max(mejorGanancia, precio - minimo);
        }
        System.out.println(mejorGanancia);
    }
}
