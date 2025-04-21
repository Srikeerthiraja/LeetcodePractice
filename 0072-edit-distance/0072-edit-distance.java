class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1];

        // Initialize base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i; // Deleting all characters from word1
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j; // Inserting all characters to word1 to make word2
        }

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters match, no operation needed
                } else {
                    // Choose the minimum from insert, delete, or replace
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], // replace
                                    Math.min(dp[i - 1][j],   // delete
                                             dp[i][j - 1])); // insert
                }
            }
        }

        return dp[n][m]; // The result is in the bottom-right cell
    }
}
