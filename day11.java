//import java.util.Scanner;
//
//public class day11 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        long total=(long) Math.pow(2,n);
//        System.out.println(total);
//    }
//}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class day11 {
    static final long MOD = 1_000_000_007L;

    static long powerOfTwo(long n) {
        long result = 1;
        long base = 2;

        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            n >>= 1;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        System.out.println(powerOfTwo(n));
    }
}
