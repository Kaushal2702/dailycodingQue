class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
       int n=boxGrid.length;
       int m=boxGrid[0].length;
       char box[][]=new char[m][n];
       // rotate box
       for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             box[j][n-1-i]=boxGrid[i][j];
         }
       } 
       for(int j=0;j<n;j++){
          for(int i=m-2;i>=0;i--){
            while(i+1<m && box[i][j]=='#' && box[i+1][j]=='.'){
                box[i+1][j]='#';
                box[i][j]='.';
                i++;
            } 
          }
       }
       return box;
    }
}
