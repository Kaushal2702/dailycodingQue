//package DynamicProgramming;
//
//public class rodCutting {
//    class Solution {
//        public int cutRod(int[] price) {
//            int len=price.length;
//            Integer[][] dp=new Integer[len][len+1];
//            return solve(len-1,len,price);
//
//        }
//        public int solve(int idx,int len,int[] price,Integer[][] dp){
//            if(idx==0) return price[0]*len;
//
//            int nottake=solve(idx-1,len,price);
//            int take=(int)-1e9;
//            int rodlen=idx+1;
//            if(rodlen<=len){
//                take=price[idx]+solve(idx,len-rodlen,price);
//            }
//            return Math.max(take,nottake);
//
//        }
//    }
//
//    class Solution {
//        public int cutRod(int[] price) {
//            int len=price.length;
//
//        }
//
//    }
//}
