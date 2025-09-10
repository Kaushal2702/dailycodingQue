//public class removedub {
//    public static void main(String[] args) {
//        int arr[]={1,1,1,2,2,3};
//        System.out.println(atmosttwice(arr));
//    }
//    static int atmosttwice(int arr[]){
//        int count=0;
//        int left=0;
//        int n= arr.length;
//        while(left<n){
//            int right=left+1;
//            while(right<n && arr[left]==arr[right]){
//                right++;
//            }
//            int freq=right-left;
//            int contain=Math.min(freq,2);
//            for(int i=0;i<contain;i++){
//
//            }
//            left=right;
//        }
//        return count;
//    }
//}


//public class removedub {
//    public static void main(String[] args) {
//        int arr[]={4,3,1,6,2,4,7,1};
//        int k=4;
//        System.out.println(maxsum(arr,k));
//    }
//    static int maxsum(int arr[],int k){
//        int left=0;
//        int rightsum=0;
//        int max=0;
//        int sum=0;
//        for(int i=0;i<k;i++){
//            sum+=arr[i];
//        }
//        max=sum;
//        int rightindex= arr.length-1;
//        for(int i=k-1;i>=0;i--){
//            left=left-arr[i];
//            rightsum=rightsum+arr[rightindex];
//            rightindex=rightindex-1;
//        }
//        max=Math.max(max,left+rightindex);
//
//        return max;
//    }
//}

// 239

import java.util.Arrays;

public class removedub {
    public static void main(String[] args) {
        int nums[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maximum(nums,k)));
    }
    static int[] maximum(int nums[],int k){
        int n= nums.length;
        int result=n-k+1;
        int output[]=new int[result];
//        for(int i=0;i<= n-k;i++){
//            int max=nums[i];
//            for(int j=i;j<i+k;j++){
//                if(nums[j]>max){
//                    max=nums[j];
//                }
//            }
//            output[i]=max;
//
//        }
        int max=nums[0];
        for(int i=0;i<k;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        output[0]=max;
        for(int i=1;i<=n-k;i++){
            int out=nums[i-1];
            int in=nums[i+k-1];
            if(out==max){
                max=nums[i];
                for(int j=i;j<i+k;j++){
                    if(nums[j]>max){
                        max=nums[j];
                    }
                }
            }
            else{
                if(in>max){
                    max=in;
                }
            }
            output[i]=max;
        }
        return output;
    }
}