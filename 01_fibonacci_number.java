import java.util.*;
class Solution {
    int fibo(int dp[], int n){
        // dp[0]=0;
        // if(n>=1) dp[1]=1;
        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        int prev2=0, prev=1;
        for(int i=2;i<=n;i++){
            int curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return n==0?prev2:prev;
    }
    public int fib(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        return fibo(dp, n);
    }
}