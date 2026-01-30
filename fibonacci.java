package DynamicProgramming;

import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
//        int res=fiboTablution(n);
        int res=fib0Swap(n);
        System.out.println(res);
    }
    public static int fibo(int n,int dp[]){
        if(n<=1) return n;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]= fibo(n - 1, dp) + fibo(n - 2, dp);
    }
    // tabluation method
    private static int fiboTablution(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    // swapping approach
    private static int fib0Swap(int n){
        int prev2=0;
        int prev1=1;
        for(int i=2;i<=n;i++) {
            int curr = prev1 + prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
// time complexity=O(n) space complexity =O(1)


