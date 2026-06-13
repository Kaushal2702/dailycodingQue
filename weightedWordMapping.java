class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            String curr=words[i];
            int sum=0;
            for(int j=0;j<curr.length();j++){
                char ch=curr.charAt(j);
                int index=ch-'a';
                sum+=weights[index];
            }
            sum=(26-(sum%26));
            ans.append((char) (sum+'a'-1));
            
        }
        return ans.toString();
    }
}
