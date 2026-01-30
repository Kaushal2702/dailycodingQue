//package DynamicProgramming;
//
//public class countStairs {
//    public static void main(String[] args) {
//        int n=5;
//        int dp[]=new int[n+1];
//        int res=countways(n,dp);
//        int k=3;
//        System.out.println(res);
//    }
//    public static int countways(int n,int dp[],int k){
//        dp[0]=0;
//        dp[1]=1;
//        dp[2]=2;
//        for(int i=k;i<=n;i++){
//            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
//        }
//
//    }
//}
