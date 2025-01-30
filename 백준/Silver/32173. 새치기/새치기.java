import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long mx = 0;
        long sum = 0;
        for (int i = 0; i < N; ++i) {
            int cur = sc.nextInt();
            mx = Math.max(mx, cur - sum);
            sum += cur;
        }
        System.out.println(mx);
    }
}