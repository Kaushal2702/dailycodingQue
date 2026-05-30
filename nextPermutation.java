class Solution {
    public void nextPermutation(int[] nums) {
        int arr[]=new int[nums.length];
        int n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                int j=n-1;
                while(nums[j]<=nums[i-1]){
                    j--;
                }
                swap(nums,i-1,j);
                reverse(nums,i,n-1);
                return;
            }
            
        }
        reverse(nums,0,n-1);
    }
    public void swap(int nums[],int a,int b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
    }
    public void reverse(int nums[],int left,int right){
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}
