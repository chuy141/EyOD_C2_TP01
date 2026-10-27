import java.util.*;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase(Locale.ROOT);
        int izquierda = 0, derecha = s.length() - 1;

        while (izquierda < derecha) {
            while (izquierda < derecha && !Character.isLetterOrDigit(s.charAt(izquierda))) izquierda++;
            while (izquierda < derecha && !Character.isLetterOrDigit(s.charAt(derecha))) derecha--;
            if (s.charAt(izquierda) != s.charAt(derecha)) {
                System.out.println("false");
                return;
            }
            izquierda++;
            derecha--;
        }
        System.out.println("true");
    }
}
