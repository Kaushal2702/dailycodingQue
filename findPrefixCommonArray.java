class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int pref[]=new int[n+1];
        int ans[]=new int[n];
        int comm=0;
        
        for(int i=0;i<n;i++){
           pref[A[i]]++;
           if(pref[A[i]]==2){
            comm++;
           }
           pref[B[i]]++;
           if(pref[B[i]]==2){
            comm++;
           }
           ans[i]=comm;
        }
        return ans;
    }
}
