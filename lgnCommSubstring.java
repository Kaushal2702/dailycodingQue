package DynamicProgramming;

import java.util.Arrays;

public class lgnCommSubstring {
    public static void main(String[] args) {
        String s1="ABCDGH";
        String s2="ACDGHR";
        System.out.println(countSubstring(s1,s2));
    }
    public static int countSubstring(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int dp[][]=new int[n1][n2];
        Arrays.fill(dp,-1);
        return helper(s1,s2,s1.length(),s2.length(),0,dp);
    }
    static int helper(String s1,String s2,int i,int j,int count,int dp[][]){
        if(i==0 || j==0) return count;
        int curcount=count;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i-1)==s2.charAt(j-1)) {
            curcount=helper(s1, s2, i-1, j-1, count+1,dp);
        }
        int c1=helper(s1,s2,i-1,j,0,dp);
        int c2=helper(s1,s2,i,j-1,0,dp);
        return Math.max(curcount,Math.max(c1,c2));
    }
}
