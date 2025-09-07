import java.util.Scanner;

public class cfalicebob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int bobcount=0;
        int alicecount=0;
        int bobtime=0;
        int alicetime=0;
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            if(alicetime<=bobtime){
                alicetime+=arr[left];
                left++;
                alicecount++;
            }
            else{
                bobtime+=arr[right];
                right--;
                bobcount++;
            }
        }
        System.out.println(alicecount+" "+bobcount);
    }
}
