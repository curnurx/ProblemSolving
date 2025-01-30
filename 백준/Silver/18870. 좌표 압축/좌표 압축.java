import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sorted = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sorted[i] = sc.nextInt();
        }
        Arrays.sort(sorted);
        int count = 0;
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            if (!rankMap.containsKey(sorted[i])) {
                rankMap.put(sorted[i], count++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append(rankMap.get(arr[i]));
            sb.append(' ');
        }
        System.out.print(sb.toString());
    }
}