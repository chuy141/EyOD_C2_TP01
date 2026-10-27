import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> numeros = new HashSet<>();
        for (int i = 0; i < n; i++) numeros.add(sc.nextInt());

        int mayor = 0;
        for (int x : numeros) {
            if (!numeros.contains(x - 1)) {
                int actual = x;
                int longitud = 1;
                while (numeros.contains(actual + 1)) {
                    actual++;
                    longitud++;
                }
                mayor = Math.max(mayor, longitud);
            }
        }
        System.out.println(mayor);
    }
}
