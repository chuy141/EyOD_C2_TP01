import java.util.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) height[i] = sc.nextInt();

        int izquierda = 0, derecha = n - 1;
        int maxAgua = 0;
        while (izquierda < derecha) {
            int ancho = derecha - izquierda;
            int alto = Math.min(height[izquierda], height[derecha]);
            maxAgua = Math.max(maxAgua, ancho * alto);
            if (height[izquierda] < height[derecha]) izquierda++;
            else derecha--;
        }
        System.out.println(maxAgua);
    }
}
