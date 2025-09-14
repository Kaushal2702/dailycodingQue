//public class weeklycontest {
//    public static void main(String[] args) {
//        int arr[]={1,2};
//        minperation(arr);
//    }
//    static int minperation(int arr[]){
//
//        int mincount=0;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]==arr[i+1]){
//                return 0;
//            }
//            else{
//                String binary=Integer.toBinaryString(i);
//
//            }
//        }
//    }
//}


import java.util.*;

//public class weeklycontest {
//    public static void main(String[] args) {
//        int n=9;
//        for(int i=0;i<=n;i++){
//            String str=Integer.toBinaryString(i);
//            System.out.print(str+",");
//            int left=0;
//            int right=str.length()-1;
//            int count=0;
//            boolean ispalindrome=true;
//            while(left<right){
//               if(str.charAt(left)!=str.charAt(right)){
//                   ispalindrome=false;
//                   break;
//               }
//               left++;
//               right--;
//            }
//            if(ispalindrome){
//                count++;
//            }
//        }
//        System.out.println();
//    }
//}
//public class weeklycontest {
//    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
//        int step=5;
//        int final_val=4;
//        int expectedval=0;
//        if(final_val%2==0){
//            final_val*=2;
//            step--;
//        }
//        if(step==1){
//             expectedval=(final_val-1)%3;
//        }
//        System.out.println(expectedval);
//
//    }
//}


//public class weeklycontest {
//    public static void main(String[] args) {
//        int tasks[][]={{100,100},{100,100},{100,100}};
//        System.out.println(mintime(tasks));
//
//    }
//    static int mintime(int [][]tasks){
//            int minsum=Integer.MAX_VALUE;
//            for(int i=0;i<tasks.length;i++){
//                int sum=0;
//                for(int j=0;j<tasks[i].length;j++){
//                    sum+=tasks[i][j];
//                }
//                minsum=Math.min(minsum,sum);
//            }
//            return minsum;
//        }
//    }


//public class weeklycontest {
//    public static void main(String[] args) {
//        int arr[]={1,1,1,2,2,2};
//        int k=3;
//        int result[]=maximunsum(arr,k);
//        for(int i=0;i<result.length;i++){
//            System.out.println(result[i]);
//        }
//    }
//    static int[] maximunsum(int nums[],int k){
//        HashSet<Integer> set=new HashSet<>();
//        Arrays.sort(nums);
//        int n=nums.length;
//        int res[]=new int[k];
//        int index=0;
//        for(int i=n-1;i>=0 && index<k;i--){
//            if(!set.contains(nums[i])){
//                set.add(nums[i]);
//                res[index]=nums[i];
//                index++;
//            }
//        }
//        while(index<k){
//            res[index]=1;
//            index++;
//        }
//        return res;
//    }
//}


public class weeklycontest {
    public static void main(String[] args) {
        int arr[]={4,3,2,4};
        int k=5;
        boolean res[]=cappingEle(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]);
        }
       }
    public static boolean[] cappingEle(int arr[],int k){
        boolean[] capp_ele=new boolean[arr.length];

        for(int x=1;x<=arr.length;x++){
//            System.out.print("x="+x+":");
            int capped[]=new int[arr.length];
             for(int i=0;i<arr.length;i++){
                 capped[i]=Math.min(arr[i],x);
//                 System.out.print(capped[i]+" ");

            }
            capp_ele[x-1]=canSumto(capped, k);
        }
        return capp_ele;
    }
    static boolean canSumto(int capped[],int k){
           int n=capped.length;
           boolean dp[]=new boolean[k+1];
           dp[0]=true;
           for(int num:capped){
               for(int j=k;j>=num;j--){
                   if(dp[j-num]){
                       dp[j]= true;
                   }
               }
           }
           return dp[k];
    }
}