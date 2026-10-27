import java.util.*;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int k = Integer.parseInt(sc.nextLine().trim());

        int[] frecuencia = new int[Character.MAX_VALUE + 1];
        int izquierda = 0, maxFrecuencia = 0, mejor = 0;

        for (int derecha = 0; derecha < s.length(); derecha++) {
            char c = s.charAt(derecha);
            frecuencia[c]++;
            maxFrecuencia = Math.max(maxFrecuencia, frecuencia[c]);

            while ((derecha - izquierda + 1) - maxFrecuencia > k) {
                frecuencia[s.charAt(izquierda)]--;
                izquierda++;
            }
            mejor = Math.max(mejor, derecha - izquierda + 1);
        }
        System.out.println(mejor);
    }
}
