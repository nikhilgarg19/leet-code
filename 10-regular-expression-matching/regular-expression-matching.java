public class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // Create a boolean dp array to store intermediate results
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true; // Empty pattern matches empty string
        
        // Fill the first row of dp array
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                // If the pattern has '*', then it can match zero characters
                // So, the result will be same as the result two columns before
                dp[0][j] = dp[0][j - 2];
            }
        }
        
        // Iterate through the dp array and fill it
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                
                if (sc == pc || pc == '.') {
                    // If characters match or pattern has '.', move diagonally
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    // If pattern has '*', check for two cases
                    if (p.charAt(j - 2) == sc || p.charAt(j - 2) == '.') {
                        // Case 1: '*' matches zero characters
                        // Case 2: '*' matches one or more characters
                        dp[i][j] = dp[i - 1][j] || dp[i][j - 2];
                    } else {
                        // If '*' doesn't match, skip '*' and its preceding character
                        dp[i][j] = dp[i][j - 2];
                    }
                }
            }
        }
        
        return dp[m][n]; // Final result
    }
}