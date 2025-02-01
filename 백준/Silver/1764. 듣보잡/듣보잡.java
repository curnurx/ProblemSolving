import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String s = scanner.next();
            set.add(s);
        }
        for (int i = 0; i < m; ++i) {
            String s = scanner.next();
            if (set.contains(s)) {
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}