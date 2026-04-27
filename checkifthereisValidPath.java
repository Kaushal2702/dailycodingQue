class Solution {
    private int n,m;
    private int[][] grid;
    private boolean[][] vis;
    private int dir[][][]= {
        {},
        {{0,-1},{0,1}},   
        {{-1,0},{1,0}},     
        {{0,-1},{1,0}},     
        {{0,1},{1,0}},      
        {{0,-1},{-1,0}},    
        {{0,1},{-1,0}}      
    };;

    public boolean hasValidPath(int[][] grid) {
         this.grid=grid;
         this.n=grid.length;
         this.m=grid[0].length;
       vis=new boolean[n][m];
       return dfs(0,0);
    }
    private  boolean dfs(int i,int j){
        vis[i][j]=true;
        if(i==n-1 && j==m-1) return true;
        for(int d[]:dir[grid[i][j]]){
            int nextI=i+d[0];
            int nextJ=j+d[1];
            if(nextI<0 || nextJ<0 || nextI>=n || nextJ>=m || vis[nextI][nextJ]){
                  continue;
            }
            for(int[] back:dir[grid[nextI][nextJ]]) {
                if (nextI+back[0]==i && nextJ + back[1] == j) {
                    if (dfs(nextI, nextJ)) return true;
                }
            }
        }
        return false;
    }
}
