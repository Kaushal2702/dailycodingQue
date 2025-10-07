import java.util.ArrayList;

//import java.util.Scanner;
//
//public class totalMatches {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//           int n=sc.nextInt();
//           System.out.println(2*n-2);
//        }
//        sc.close();
//    }
//}
//public class totalMatches {
//    public static void main(String[] args) {
//        int arr[]={3,1,-2,-5,2,-4};
//        int rearrange[]=reArrange(arr);
//        for(int num:rearrange) {
//            System.out.println(num);
//        }
//    }
//    static int[] reArrange(int arr[]){
//        ArrayList<Integer> arrlist=new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            if(i%2==0){
//                if(arr[i]>0){
//                    arrlist.add(arr[i]);
//                }
//            }
//            else{
//                if(arr[i]<0){
//                    arrlist.add(arr[i]);
//                }
//            }
//        }
//        int result[]=new int[arrlist.size()];
//        for(int i=0;i<arrlist.size();i++){
//            result[i]=arrlist.get(i);
//        }
//        return result;
//    }
//}



//public class totalMatches {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,4};
//        int result[]=decompress(arr);
//        for(int num:result){
//            System.out.println(num);
//        }
//    }
//    static int[] decompress(int arr[]){
//        ArrayList<Integer> al=new ArrayList<>();
//        for(int i=0;i<arr.length/2;i++) {
//            int freq = arr[2 * i];
//            int val = arr[2 * i + 1];
//            for (int j = 0; j < freq; j++) {
//                al.add(val);
//            }
//        }
//        int[] resArr=new int[al.size()];
//        for(int i=0;i<al.size();i++){
//            resArr[i]=al.get(i);
//        }
//        return resArr;
//    }
//}


//public class totalMatches {
//    public static void main(String[] args) {
//        int arr[] = {3, 1, 4, 1, 5};
//        int k = 2;
//        int res=kdiff(arr, k);
//        System.out.println(res);
//    }
//
//    static int kdiff(int nums[],int k){
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j< nums.length;j++){
//                if(Math.abs(nums[i]-nums[j])==k){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}

//public class totalMatches {
//    public static void main(String[] args) {
//        int arr[]={1,0,1,1,0,1};
//        System.out.println(maxcount(arr));
//    }
//    static int maxcount(int arr[]){
//        int max=0;
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==1){
//                count++;
//                max=Math.max(max,count);
//            }
//            else{
//                count=0;
//            }
//        }
//        return max;
//    }
//}

public class totalMatches {
    public static void main(String[] args) {
        String str="WBBWWBBWBW";
        int k=7;
        System.out.println(reColor(str,k));
    }
    static int reColor(String str,int k){
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<k;i++){
            if(str.charAt(i)=='W') count++;
        }
        min=count;
        for(int i=k;i<str.length();i++){
            if(str.charAt(i-k)=='W') count--;
            if(str.charAt(i)=='W')  count++;
            min=Math.min(min,count);
        }
        return min;
    }
}