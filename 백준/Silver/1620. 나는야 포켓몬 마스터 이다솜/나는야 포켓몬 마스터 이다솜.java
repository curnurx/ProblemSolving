import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 1; i <= n; ++i) {
            String name = scanner.nextLine();
            String idx = Integer.toString(i);
            map.put(idx, name);
            map.put(name, idx);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; ++i) {
            String input = scanner.nextLine();
            sb.append(map.get(input));
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}