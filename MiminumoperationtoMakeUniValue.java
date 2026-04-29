class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int[] r:grid){
            for(int val:r){
                al.add(val);
            }
        }
        Collections.sort(al);
        int median=al.get(al.size()/2);
        int change=0;
        for(int num:al){
            int diff=Math.abs(num-median);
            if(diff%x!=0) return -1;
            change+=diff/x;
        }
        return change;
    }
}
