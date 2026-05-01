class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int num=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          num+=i*nums[i];
        }
        int max=num;
        for(int i=1;i<n;i++){
          num+=sum-n*nums[n-i];
          max=Math.max(max,num);
        }
        return max;
       
    }
}
