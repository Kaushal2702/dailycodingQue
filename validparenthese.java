import java.util.Scanner;

public class validparenthese {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            String s=sc.next();
            if(n%2!=0){
                System.out.println(-1);
                continue;
            }

                int openbrac=0;
                int closebrac=0;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='('){
                        openbrac++;
                    }
                    else{
                        closebrac++;
                    }
                }
                if(openbrac!=closebrac){
                    System.out.println(-1);
                }
                else{
                    StringBuilder sb=new StringBuilder();
                    for(int i=0;i<n/2;i++){
                        sb.append('(');
                    }
                    for(int i=0;i<n/2;i++){
                        sb.append(')');
                    }
                    System.out.println(sb.toString());
                }
            }
            sc.close();
        }
    }
