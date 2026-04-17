class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                min=Math.min(min,i-mp.get(nums[i]));
            }
            int reve=reverse(nums[i]);
            mp.put(reve,i);   
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i!=j && reverse(nums[i])==nums[j]){
        //             min=Math.min(min,Math.abs(i-j));
        //         }
        //     }
        // }
        return min==Integer.MAX_VALUE?-1:min;
    }
    public int reverse(int n){
         int sign = n < 0 ? -1 : 1;
         n=Math.abs(n);
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev;
    }
}
