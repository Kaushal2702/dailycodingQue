class Solution {
    long pref[][];
    int grid[][];
    int n;
    public long maximumScore(int[][] grid) {
        this.grid=grid;
        n=grid.length;
        pref=new long[n+1][n];
        for(int j=0;j<n;j++){
            for(int i=1;i<=n;i++){
                pref[i][j]=grid[i-1][j]+pref[i-1][j];
            }
        }
        Long dp[][][] = new Long[2][n+1][n];
        return helper(0,0,0,dp);
    }
    public long helper(int prevTaken,int prevColLen,int currCol,Long dp[][][]){
        if(currCol==n) return 0;
        if(dp[prevTaken][prevColLen][currCol]!=null) return dp[prevTaken][prevColLen][currCol];
        long ans=0;
        for(int i=0;i<=n;i++){
            long prevAns=0, currans=0;
            if(prevTaken==0 && currCol>0 && i>prevColLen){
               prevAns=pref[i][currCol-1]-pref[prevColLen][currCol-1];

            }
            // curr Ans
            if(prevColLen>i){
                currans=pref[prevColLen][currCol]-pref[i][currCol];
            }
            long ans1=currans+prevAns+helper(1,i,currCol+1,dp);
            long ans2=prevAns+helper(0,i,currCol+1,dp);
            ans=Math.max(ans,Math.max(ans1,ans2));
        }
        return dp[prevTaken][prevColLen][currCol]=ans;
    }
}
