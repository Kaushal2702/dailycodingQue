class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
           ArrayList<Integer> temp=new ArrayList<>();
            while(num>0){
                temp.add(num%10);
                num/=10;    
            }
            for(int k=temp.size()-1;k>=0;k--){
               al.add(temp.get(k));
            }
        }
        int ans[]=new int[al.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=al.get(i);
        }
        return ans;
    }
}
