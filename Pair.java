import java.util.Stack;

public class Pair {
    char ch;
    int freq;
    public Pair(int freq){
        this.ch=ch;
        this.freq=freq;
    }
    static String removeDub(String s,int k){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && st.peek().ch==ch){
                st.peek().freq+=1;
            }
        }
    }
}
