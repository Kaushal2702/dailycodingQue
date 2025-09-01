import java.util.Scanner;

//public class day9 {
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int k=1;k<=n;k++) {
//            long total =(long) k*k*(k * k-1)/2;
//            long attack=4L*(k-1)*(k-2);
//            long result=total-attack;
//            System.out.println(result);
//
//        }
//    }
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();
        for (int k = 1; k <= n; k++) {
            long kk = (long) k * k;
            long total = kk * (kk - 1) / 2;           // C(k^2, 2)
            long attack = 4L * (k - 1) * (k - 2);     // 4*(k-1)*(k-2)
            long ans = total - attack;
            out.append(ans).append('\n');
        }
        System.out.print(out.toString());
    }
}

