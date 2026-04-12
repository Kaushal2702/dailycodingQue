class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public  Pair getCordinate(char ch){
        int curr=(int)ch-'A';
        return new Pair(curr/6,curr%6);
    }
    public int getDis(int x1,int y1,int x2,int y2){
        return Math.abs(x2-x1)+Math.abs(y2-y1);
    }
    public int minimumDistance(String word) {
        Integer dp[][][][][]=new Integer[301][8][8][8][8];
        return solve(word,0,-1,-1,-1,-1,dp);
    }
    public int solve(String word ,int idx,int x1,int y1,int x2,int y2,Integer dp[][][][][]){
         if(idx>=word.length()) return 0;
         if(dp[idx][x1+1][y1+1][x2+1][y2+1]!=null){
            return dp[idx][x1+1][y1+1][x2+1][y2+1];
         }
         Pair corrdinate=getCordinate(word.charAt(idx));
         int x=corrdinate.x;
         int y=corrdinate.y;
         int result;
         // if both coordinate are not used
        if(x1==-1 && y1==-1 && x2==-1 && y2==-1){
           return solve(word,idx+1,x,y,x2,y2,dp);
        }
        else if(x2 == -1 && y2 == -1){
            int moveFinger2 = solve(word, idx + 1, x1, y1, x, y, dp);
            int moveFinger1 = getDis(x, y, x1, y1) + solve(word, idx + 1, x, y, x2, y2, dp);
            result = Math.min(moveFinger1, moveFinger2);
        }
        else {
            int moveFinger1=getDis(x, y, x1, y1)+solve(word,idx +1, x, y, x2, y2, dp);
            int moveFinger2=getDis(x, y, x2, y2)+solve(word, idx + 1, x1, y1, x, y, dp);
            result = Math.min(moveFinger1, moveFinger2);
        }
        return dp[idx][x1 +1][y1+ 1][x2+ 1][y2 + 1]=result;
    }
}
