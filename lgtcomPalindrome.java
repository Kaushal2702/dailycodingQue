package DynamicProgramming;

import java.util.Arrays;

public class lgtcomPalindrome {
    public static void main(String[] args) {
        String s="bbbb";
        System.out.println(countLongestPalidrome(s));
    }
    static int countLongestPalidrome(String s){

        int n=s.length();
        if(n==0) return 0;
        int dp[][]=new int[n][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helper(s,0,n-1,dp);
    }
    static int helper(String s,int i,int j,int[][] dp){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]= 2+helper(s,i+1,j-1,dp);
        }else{
            dp[i][j]= Math.max(helper(s, i, j - 1, dp), helper(s, i + 1, j, dp));
        }
        return dp[i][j];
    }
}
