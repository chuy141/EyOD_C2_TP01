import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, List<String>> grupos = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String palabra = sc.nextLine().trim();
            char[] letras = palabra.toCharArray();
            Arrays.sort(letras);
            String clave = new String(letras);
            grupos.computeIfAbsent(clave, x -> new ArrayList<>()).add(palabra);
        }

        for (List<String> grupo : grupos.values()) {
            System.out.println(String.join(" ", grupo));
        }
    }
}
