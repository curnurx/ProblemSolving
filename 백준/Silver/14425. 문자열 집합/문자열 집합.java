import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            String str = scanner.next();
            set.add(str);
        }
        int cnt = 0;
        for (int i = 0; i < m; ++i) {
            String str = scanner.next();
            if (set.contains(str)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}