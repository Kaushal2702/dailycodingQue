class Solution {
    public int mirrorDistance(int n) {
        if(n<10) return 0;
        int res=reverse(n);
        int ans=Math.abs(n-res);
        return ans;
    }
    public int reverse(int n){
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=10*rev+digit;
            n/=10;
        }
        return rev;
    }
}
