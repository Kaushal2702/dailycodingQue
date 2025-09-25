//import java.util.HashMap;
//import java.util.Map;
//
//public class maxsumor {
//    public static void main(String[] args) {
//        int arr[] = {1, 1,1, 4, 4, 4};
//        System.out.println(checkbalance(arr));
//    }
//    static int checkbalance(int arr[]){
//        int res=0;
//        HashMap<Integer,Integer> mp=new HashMap<>();
//        for(int num:arr){
//            mp.put(num,mp.getOrDefault(num,0)+1);
//        }
//        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
//            if (e.getValue() % 2 != 0) {
//                return e.getKey();
//            }
//        }
//        return 0;
//    }
//}
import java.util.*;

public class balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // count frequencies
            Map<Integer,Integer> freq = new HashMap<>();
            int maxFreq = 0;
            for (int x : arr) {
                int f = freq.getOrDefault(x, 0) + 1;
                freq.put(x, f);
                maxFreq = Math.max(maxFreq, f);
            }

            int ans = 0;
            // try every possible f
            for (int f = 1; f <= maxFreq; f++) {
                int count = 0;
                for (int val : freq.values()) {
                    if (val >= f) count++;
                }
                ans = Math.max(ans, count * f);
            }

            System.out.println(ans);
        }
    }
}
