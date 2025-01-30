import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N - 1; ++i) {
            sb.append("1 -1 ");
        }
        sb.append("-1 1");
        System.out.println(sb.toString());
    }
}