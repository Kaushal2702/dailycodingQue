import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        Long x=sc.nextLong();
        long n[]=new long[p];
        for (int i = 0; i < p; i++) {
            n[i] = sc.nextLong();
        }
        long count=0,sum=0;
        int left=0;
        for(int right=0;right<n.length;right++){
            sum+=n[right];
            while(sum>x && left<=right){
                sum-=n[left];
                left++;
            }
            if(sum==x){
                count++;
            }

        }
        System.out.println(count);

    }
}
