import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // Input is uppercase already

        int freq[] = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'A']++;
        }

        int oddcount = 0;
        int oddcharindex = -1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                oddcount++;
                oddcharindex = i;
            }
        }

        if (oddcount > 1) {
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder half = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                half.append((char)(i + 'A'));
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(half);

        if (oddcharindex != -1) {
            result.append((char)(oddcharindex + 'A'));  // Append the odd char once
        }

        result.append(half.reverse());

        System.out.println(result.toString());
    }
}
