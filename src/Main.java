import java.util.*;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k == 0) {
            System.out.println(1);
            return;
        }

        Map<Integer, Integer> black = new HashMap<>();
        Map<Integer, Integer> white = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    int key = i - j;
                    black.put(key, black.getOrDefault(key, 0) + 1);
                } else {
                    int key = i + j;
                    white.put(key, white.getOrDefault(key, 0) + 1);
                }
            }
        }

        long[] dpBlack = solve(new ArrayList<>(black.values()), k);
        long[] dpWhite = solve(new ArrayList<>(white.values()), k);

        long ans = 0;
        for (int i = 0; i <= k; i++) {
            ans = (ans + dpBlack[i] * dpWhite[k - i]) % MOD;
        }
        System.out.println(ans);
    }

    static long[] solve(List<Integer> lengths, int k) {
        long[] dp = new long[k + 1];
        dp[0] = 1;
        for (int len : lengths) {
            for (int j = k; j >= 1; j--) {
                dp[j] = (dp[j] + dp[j - 1] * len) % MOD;
            }
        }
        return dp;
    }
}