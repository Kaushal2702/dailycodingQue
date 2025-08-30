import java.util.HashMap;
import java.util.Scanner;



public class day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        Long x = sc.nextLong();
        long n[] = new long[p];
        for (int i = 0; i < p; i++) {
            n[i] = sc.nextLong();
        }
        long count = 0, prefix= 0;
        HashMap<Long,Long> map=new HashMap<>();
        for(int i=0;i<p;i++){
            prefix+=n[i];
            if(map.containsKey(prefix-x)){
                count+= map.get(prefix-x);
            }
            map.put(prefix,map.getOrDefault(prefix,0L)+1);
        }
        System.out.println(count);


    }
}

