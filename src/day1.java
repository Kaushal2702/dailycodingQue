import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        weirdAlg(n);
    }
    static void weirdAlg(Long n){

        while(n!=1){
            System.out.print(n+" ");
            if (n%2==0) {
                n=n/2;
            }
            else{
                n= n*3+1;
            }

        }
        System.out.print(1+" ");
    }
}
