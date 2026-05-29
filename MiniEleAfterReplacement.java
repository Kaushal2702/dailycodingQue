class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num[]=digit(nums,nums[i]);  
            min=Math.min(min,num[i]); 
        }    
        return min;
    }
    public int[] digit(int nums[],int num){
        int arr[]=new int[nums.length];
        int sum=0;
        while(num>0){
            int last=num%10;
            sum+=last;
            num/=10;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=sum;
        }
        return arr;
    }
}
