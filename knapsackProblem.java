package DynamicProgramming;

public class knapsackProblem {
    public static void main(String[] args) {
        int weight[]={2,3,8,5,4};
        int val[]={12,7,1,2,8};
        int cap=10;
        int n=weight.length;
        System.out.println(minWeight(n-1,weight,val,cap));
    }
    static int minWeight(int i,int weight[],int val[],int cap){
        if(i==0){
            if(weight[i]<cap){
                return val[0];
            }
            else{
                return 0;
            }
        }
        int include=0;
        if(weight[i]<cap){
            include=val[i]+minWeight(i-1,weight,val,cap-weight[i]);
        }
        int exclude=minWeight(i-1,weight,val,cap);
        int ans=Math.max(include,exclude);
        return ans;
    }
}
