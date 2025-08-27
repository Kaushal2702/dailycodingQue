import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(increaseArray(n,arr));
    }
    static long increaseArray(int n,int arr[]){
        long move=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                 move+=(arr[i]-arr[i+1]);
                arr[i+1]=arr[i];

            }
        }
        return move;
    }
}
