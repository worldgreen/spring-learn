package com.study.model;


import lombok.Data;

@Data
public class T1 {
    Integer id;

    String name;

    public int palindromePartition(String s, int k) {
        int[][][] dp = new int[s.length()][s.length()][k + 1];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                for (int t = 0; t <= k; t++) {
                    dp[i][j][t] = -1;
                }
            }
        }
        return ms(s, k, dp, 0, s.length() - 1);
    }

    private int ms(String s, int k, int[][][] dp, int i, int j) {
        if (dp[i][j][k] > -1) return dp[i][j][k];
        if (k == 1) return c(s, i, j);
        if (i == j) {
            if (k <= 1) return dp[i][j][k] = k;
            return dp[i][j][k] = Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        for (int t = i; t < j; t++) {
            int x1 = ms(s, 1, dp, i, t);
            int x2 = ms(s, k - 1, dp, t + 1, j);
            if (x1 != Integer.MAX_VALUE && x2 != Integer.MAX_VALUE) min = Math.min(min, x1 + x2);
        }
        dp[i][j][k] = min;
        return min;
    }

    private int c(String s, int i, int j) {
        int res = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                res++;
            }
            i++;j--;
        }
        return res;
    }
}