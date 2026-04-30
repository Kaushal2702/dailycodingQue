class Solution {
    Integer dp[][][];
    public int maxPathScore(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        dp=new Integer[n][m][k+1];
        int res=solve(0,0,grid,k,0);
        return res==Integer.MIN_VALUE?-1:res;
    }
    public int solve(int i,int j,int grid[][],int k,int cost){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=m || j>=n) return Integer.MIN_VALUE;
        //for down
        int newCost=cost+(grid[i][j]>0?1:0);
        if(newCost>k){
            return Integer.MIN_VALUE;
        }
        if(i==m-1 && j==n-1) return grid[i][j];
        if(dp[i][j][newCost]!=null){
            return dp[i][j][newCost];
        } 
        int right=solve(i,j+1,grid,k,newCost);
        int down=solve(i+1,j,grid,k,newCost);
        int max=Math.max(down,right);
        if(max==Integer.MIN_VALUE) return dp[i][j][newCost]=Integer.MIN_VALUE;
        else dp[i][j][newCost]=grid[i][j]+max;
        return dp[i][j][newCost];
    }
}
