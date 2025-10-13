import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class rmvAnagram {
    public static void main(String[] args) {
        String s[]={"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagram(s));
    }
    static List<String> removeAnagram(String s[]){
        ArrayList<String> result=new ArrayList<>();
        HashSet<String > seen=new HashSet<>();
        for(String word:s){
            char ch[]=word.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if(!seen.contains(sorted)){
                result.add(word);
                seen.add(sorted);
            }
        }
        return result;
    }
}
