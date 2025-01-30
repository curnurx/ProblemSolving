import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int dir = 0;
        int cnt = 0;
        for (char c : str.toCharArray()) {
            dir += c == 'R' ? 1 : -1;
            if (dir == -4) {
                dir = 0;
            }
            if (dir == 4) {
                dir = 0;
                ++cnt;
            }
        }
        System.out.println(cnt);
    }
}