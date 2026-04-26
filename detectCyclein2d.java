public class Pair{
    int r,c,pr,pc;
    Pair(int r,int c,int pr,int pc){
        this.r=r;
        this.c=c;
        this.pr=pr;
        this.pc=pc;
    }
}
class Solution {
    int dr[]={0,-1,0,1};
    int dc[]={-1,0,1,0};
    public boolean containsCycle(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
       boolean vis[][]=new boolean[n][m];
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j]){
                    if(bfs(i,j,grid,vis,n,m)){
                        return true;
                    }       
                }
            }
       }
       return false;
    }
    public boolean bfs(int i,int j,char grid[][],boolean vis[][],int n,int m){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j,-1,-1));
        vis[i][j]=true;
        while(!q.isEmpty()){
            Pair curr=q.poll();
            for(int index=0;index<4;index++){
                int nRow=curr.r+dr[index];
                int nCol=curr.c+dc[index];
                if(nRow>=0 && nCol>=0 && nRow<n && nCol<m && grid[curr.r][curr.c]==grid[nRow][nCol]){
                    if(!vis[nRow][nCol]){
                        vis[nRow][nCol]=true;
                        q.add(new Pair(nRow,nCol,curr.r,curr.c));
                    }
                    else if(nRow!=curr.pr || nCol!=curr.pc) return true;
                }
            }
        }
        return false;
    }
}
