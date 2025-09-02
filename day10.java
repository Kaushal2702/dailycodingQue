//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class day10 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int result=(n*(n+1))/2;
//        if(result%2!=0){
//            System.out.println("NO");
//        }else {
//            int target=result/2;
//            ArrayList<Integer> set1=new ArrayList<>();
//            ArrayList<Integer> set2=new ArrayList<>();
//            for(int i=n;i>=1;i--){
//                if(target>=i){
//                    set1.add(i);
//                    target-=i;
//                }else {
//                    set2.add(i);
//                }
//            }
//            System.out.println("YES");
//            System.out.println(set1.size());
//            for(int x:set1){
//                System.out.print(x+" ");
//            }
//            System.out.println();
//            System.out.println(set2.size());
//            for(int y:set2){
//                System.out.print(y+" ");
//            }
//        }
//    }
//}
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

public class day10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = (long) n * (n + 1) / 2;

        if (sum % 2 != 0) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

        long target = sum / 2;
        StringBuilder set1 = new StringBuilder();
        StringBuilder set2 = new StringBuilder();
        int count1 = 0, count2 = 0;

        // Greedy: assign numbers to sets
        for (int i = n; i >= 1; i--) {
            if (target >= i) {
                set1.append(i).append(" ");
                target -= i;
                count1++;
            } else {
                set2.append(i).append(" ");
                count2++;
            }
        }

        // Print first set
        System.out.println(count1);
        System.out.println(set1.toString().trim());

        // Print second set
        System.out.println(count2);
        System.out.println(set2.toString().trim());
    }
}
