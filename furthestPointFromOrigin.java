class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int i=0;
        int j=moves.length();
        int countL=0;
        int countR=0;
        int count_=0;
        int max=0;
        while(i<j){
            if(moves.charAt(i)=='L'){
                countL++;
            }
            else if(moves.charAt(i)=='R'){
                countR++;
            }
            else{
                count_++;
            }
            i++;
        }
        max=Math.abs(countL-countR)+count_;
        return max;
    }
}
