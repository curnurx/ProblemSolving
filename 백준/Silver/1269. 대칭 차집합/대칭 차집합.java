import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        HashSet set1 = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            set1.add(scanner.nextInt());
        }
        int cnt = 0;
        for (int i = 0; i < m; ++i) {
            if (set1.contains(scanner.nextInt())) {
                cnt++;
            }
        }
        System.out.println(n + m - cnt * 2);
    }
}