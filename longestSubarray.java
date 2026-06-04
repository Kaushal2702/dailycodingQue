class Solution {
    public int longestSubarray(int[] nums) {
        int countcurr=0;
        int countprev=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                countcurr++;
            }
            else{
                ans=Math.max(ans,countprev+countcurr);
                countprev=countcurr;
                countcurr=0;
            }
        }
        ans=Math.max(ans,countprev+countcurr);
        if(ans==nums.length){
            return nums.length-1;
        }
        return ans;
    }
}
