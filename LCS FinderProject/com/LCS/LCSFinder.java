package com.LCS;

public class LCSFinder {
	 public static String findLCS(String s1, String s2) {
	        int m = s1.length();
	        int n = s2.length();
	        int[][] dp = new int[m + 1][n + 1];

	        // Build the DP table
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
	                    dp[i][j] = dp[i - 1][j - 1] + 1;
	                } else {
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                }
	            }
	        }

	        // Reconstruct the LCS from the DP table
	        StringBuilder lcs = new StringBuilder();
	        int i = m, j = n;
	        while (i > 0 && j > 0) {
	            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
	                lcs.append(s1.charAt(i - 1));
	                i--;
	                j--;
	            } else if (dp[i - 1][j] > dp[i][j - 1]) {
	                i--;
	            } else {
	                j--;
	            }
	        }

	        return lcs.reverse().toString();
	    } public static void main(String[] args) {
	        // Test case 1: "abcde" and "ace"
	        String s1 = "abcde";
	        String s2 = "ace";
	        System.out.println("LCS of \"" + s1 + "\" and \"" + s2 + "\" is: \"" + findLCS(s1, s2) + "\"");

	        // Test case 2: "abcdef" and "fbdamn"
	        s1 = "abcdef";
	        s2 = "fbdamn";
	        System.out.println("LCS of \"" + s1 + "\" and \"" + s2 + "\" is: \"" + findLCS(s1, s2) + "\"");

	        // Test case 3: "xyz" and "pqr"
	        s1 = "xyz";
	        s2 = "pqr";
	        System.out.println("LCS of \"" + s1 + "\" and \"" + s2 + "\" is: \"" + findLCS(s1, s2) + "\"");
	    }
}
