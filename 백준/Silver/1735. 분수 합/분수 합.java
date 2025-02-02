import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        int lcm = b1 * b2 / gcd(b1, b2);
        a1 *= lcm / b1;
        a2 *= lcm / b2;
        int div = gcd(a1 + a2, lcm);
        System.out.print((a1 + a2) / div);
        System.out.print(" ");
        System.out.print(lcm / div);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}