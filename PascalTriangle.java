class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<numRows;i++){
           List<Integer> curr=new ArrayList<>();
           for(int j=0;j<=i;j++){
              if(j==0 || j==i){
                curr.add(1);
              }
              else{
                curr.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
              }
           }
           triangle.add(curr);
        }
        return triangle;
    }
}
