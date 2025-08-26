import java.util.Scanner;

//import java.util.Scanner;
//
//public class day3 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        maxcountstr(str);
//    }
//    static void maxcountstr(String str){
//        char maxchar=' ';
//        int maxcount=0;
//        for(char ch='A';ch<='Z';ch++){
//            int count=0;
//            for(int i=0;i<str.length();i++){
//                if(str.charAt(i)==ch){
//                    count++;
//                }
//            }
//            if(count>maxcount){
//                maxcount=count;
//                maxchar=ch;
//            }
//        }
//        System.out.println(maxcount);
//    }
//}
public class day3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int maxcount=1;
        int currcount=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                currcount++;
            }else{
                currcount=1;
            }
            maxcount=Math.max(currcount,maxcount);
        }

        System.out.println(maxcount);
    }
}