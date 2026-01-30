package DynamicProgramming;

public class frogJump {
    public static void main(String[] args) {
        int height[]={2,3,1,1,4};
         System.out.println(frogjumpp(height));
    }
    static int frogjumpp(int height[]){
         return helper(0,height);
    }
    static  int helper(int i,int height[]){
        if(i==height.length-1) return 0;
        int ans=Integer.MAX_VALUE;
        for(int j=1;j<=height[i];j++){
            int res=helper(i+j,height);
            if(res!=Integer.MAX_VALUE){
                ans=Math.min(ans,1+res);
            }
        }

        return  ans;
    }
}
