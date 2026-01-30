package DynamicProgramming;
//
//import java.util.Scanner;
//
//public class fibonaccharis {
//    public static void main(String[] args) {
//        long t;
//        Scanner sc=new Scanner(System.in);
//        t=sc.nextLong();
//        while(t-->0){
//            solve();
//        }
//    }
//    static void solve(){
//        long n,k;
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextLong();
//        k=sc.nextLong();
//        long count =0;
//        for(long i=0;i<=n;i++){
//            long second=n;
//            long first=i;
//            boolean isValid=true;
//            for(long j=k-2;j>=1;j--){
//                long newE=second-first;
//                // new E should be less than or equal first
//                if(newE>first){
//                    isValid=false;
//                    break;
//                }
//                if(newE<0){
//                    isValid=false;
//                    break;
//                }
//                second=first;
//                first=newE;
//            }
//            if(isValid==true){
//                count++;
//            }
//        }
//        System.out.println("Number of pattern: " +count);
//    }
//}
import java.io.*;
import java.util.*;

public class fibonaccharis {

    static FastScanner sc = new FastScanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    private static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long count = 0;

        for (long i = 0; i <= n; i++) {

            boolean isValid = true;
            long second = n;   // kth term
            long first = i;    // (k-1)th term

            for (long j = k - 2; j >= 1; j--) {
                long newE = second - first;

                if (newE < 0) {
                    isValid = false;
                    break;
                }
                else if (newE > first) {
                    isValid = false;
                    break;
                }
                else {
                    // update sequence
                    second = first;
                    first = newE;
                }
            }

            if (isValid) {
                count++;
            }
        }

        System.out.println(count);
    }


    // Fast Scanner using InputStream + StringTokenizer
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}