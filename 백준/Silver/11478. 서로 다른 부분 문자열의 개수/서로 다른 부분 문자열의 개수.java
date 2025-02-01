import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i; j < s.length(); ++j) {
                set.add(s.substring(i, j + 1));
            }
        }
        System.out.println(set.size());
    }
}