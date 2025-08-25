import java.util.Scanner;

public class day2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long arr[]=new long[(int)n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextLong();
        }
        System.out.println(missingNum(n,arr));
    }
    static long missingNum(long n,long arr[]){
        long expectsum=(n*(n+1))/2;
        long actualsum=0;

        for(long val:arr){
              actualsum+=val;
        }
        return expectsum-actualsum;

    }
}
