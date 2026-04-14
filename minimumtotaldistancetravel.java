class Solution {
    Long dp[][][];
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) { 
        Collections.sort(robot);
        Arrays.sort(factory,(a,b)->a[0]-b[0]);
        int Limit=0;
        for(int i[]:factory){
           Limit=Math.max(Limit,i[1]);
        }
        dp=new Long[robot.size()][factory.length][Limit+1];
        return solve(robot,factory,0,0,0);
    }
    public long solve(List<Integer> robot,int[][] factory,int i,int j,int used){ 
        // i is robot index
        // j is factory index 
        if(i==robot.size()) return 0;
        if(j>=factory.length) return Long.MAX_VALUE;

        if(dp[i][j][used]!=null){
            return dp[i][j][used];
        }
        long res=Long.MAX_VALUE;
        res=solve(robot,factory,i,j+1,0);
        if(used<factory[j][1]){
            long next=solve(robot,factory,i+1,j,used+1);
            if(next!=Long.MAX_VALUE){
                res=Math.min(res,Math.abs(robot.get(i)-factory[j][0])+next);
            }
        }
        return dp[i][j][used]=res;  
    }
}
