import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();    
        }
        Arrays.sort(arr);
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int findVal = sc.nextInt();
            boolean isFound = Arrays.binarySearch(arr, findVal) >= 0;
            sb.append((isFound? 1 : 0));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}