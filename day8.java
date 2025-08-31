import java.util.*;
import java.io.*;
public class day8 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine()); // number of test cases

            for (int i = 0; i < t; i++) {
                String[] parts = br.readLine().split(" ");
                long y = Long.parseLong(parts[0]);
                long x = Long.parseLong(parts[1]);
                long n = Math.max(y, x);
                long ans;

                if (n % 2 == 0) { // even layer
                    if (y == n) {
                        ans = n * n - (x - 1);
                    } else {
                        ans = (n - 1) * (n - 1) + y;
                    }
                } else { // odd layer
                    if (x == n) {
                        ans = n * n - (y - 1);
                    } else {
                        ans = (n - 1) * (n - 1) + x;
                    }
                }

                sb.append(ans).append("\n");
            }
            System.out.print(sb.toString());
        }
    }


