//package DynamicProgramming;
//
//public class targetSum {
//    class Solution {
//        int sum;
//        public int findTargetSumWays(int[] nums, int target) {
//            int n=nums.length;
//            int totalsum=0;
//            for(int x:nums) totalsum+=x;
//            sum=totalsum;
//            int dp[][]=new int[n+1][2*sum+1];
//            for(int row[]:dp){
//                Arrays.fill(row,-1);
//            }
//            return helper(0,0,target,nums,dp);
//        }
//        public int helper(int i,int tsum,int target,int nums[],int dp[][]){
//
//            if(i>=nums.length){
//                return tsum==target?1:0;
//            }
//            if(dp[i][sum + tsum]!=-1) return dp[i][sum+tsum];
//            int substract=helper(i+1,tsum-nums[i],target,nums,dp);
//            int add=helper(i+1,tsum+nums[i],target,nums,dp);
//            return dp[i][sum+tsum]=substract+add;
//        }
//    }
//}
