//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class day12 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        long n=Long.parseLong(br.readLine().trim());
//
//        char ch[]=String.valueOf(n).toCharArray();
//        int count=0;
//        int left=0;
//        int right= ch.length-1;
//        while(right>=left && ch[right]=='0'){
//                count++;
//                right--;
//        }
//        System.out.println(count);
//    }
//    static long fact(int n){
//        if(n<=1) return 1;
//        return n*fact(n-1);
//    }
//}

import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long zeros = 0;
        for (long i = 5; n / i >= 1; i *= 5) {
            zeros += n / i;
        }
        System.out.println(zeros);
    }
}

