import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet set = new HashSet();
        for (int i = 0; i < n; ++i) {
            set.add(scanner.nextInt());
        }
        int m = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; ++i) {
            sb.append((set.contains(scanner.nextInt()) ? "1 ": "0 "));
        }
        System.out.println(sb.toString());
    }
}