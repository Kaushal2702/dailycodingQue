public class maxLenRepeat {
    public static void main(String[] args) {
        int num1[]={1,2,3,2,1};
        int num2[]={3,2,1,4,7};
        System.out.println(matching(num1,num2));
    }
    static int matching(int num1[],int num2[]){
        int i=0;
        int j=0;
        int count=0;
        while(i< num1.length-1){
           while(j<num2.length-1){
               if(num1[i]!=num2[j]){
                   i++;
               }
              
            }
        }
        return count;
    }
}


//public class maxLenRepeat {
//    public static void main(String[] args) {
//        int arr[] = {10, 5, 2, 6};
//        int k = 10;
//        System.out.println(maxproduct(arr, k));
//    }
//    static int maxproduct(int arr[],int k){
//        if(k<=1) return 0;
//        int left=0;
//        int product=1;
//        int count=0;
//        for(int right=0;right<arr.length;right++) {
//            product *= arr[right];
//            while (product >=k) {
//                product /= arr[left];
//                left++;
//            }
//            count += (right - left + 1);
//        }
//        return count;
//    }
//}