import java.util.Arrays;
class Solution {
    int climb(int dp[], int n){
        // dp[0]=1;
        // dp[1]=1;
        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        int prev2=1, prev=1;
        for(int i=2;i<=n;i++){
            int curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        return climb(dp, n);
    }
}