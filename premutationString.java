import java.util.Arrays;

public class premutationString {
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidbaooo";
        System.out.println(checkpermutation(s1,s2));
    }
    static boolean checkpermutation(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int s1_freq[]=new int[26];
        int s2_freq[]=new int[26];
        for(char ch:s1.toCharArray()){
            s1_freq[ch-'a']++;
        }
        int i=0;
        int j=0;
        while(j<m){
            s2_freq[s2.charAt(j)-'a']++;
            if(j-i+1>n){
                s2_freq[s2.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(s1_freq,s2_freq)){
                return true;
            }
            j++;
        }
        return false;
    }
}
