class Solution {
    public int maxDistance(int[] colors) {
        int maxDis=0;
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    maxDis=Math.max(maxDis,Math.abs(i-j));
                }
            }
        }
        return maxDis;
    }
}
