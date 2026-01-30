package DynamicProgramming;

public class PaintHouse {
    public static void main(String[] args) {
        int[][] ph={{17,2,17}, {16,16,5}, {14,3,19} };
        int n=ph.length;
        int res=paintHouse(n,ph);
        System.out.println(res);
    }
    // optimized
    static int paintHouse(int n,int ph[][]){
        int last1=ph[0][0];
        int last2=ph[0][1];
        int last3=ph[0][2];
        for(int i=1;i<n;i++){
            int curr1=Math.min(last2,last3)+ph[i][0];
            int curr2=Math.min(last1,last3)+ph[i][1];
            int curr3=Math.min(last1,last2)+ph[i][2];
            last1=curr1;
            last2=curr2;
            last3=curr3;
        }
        return Math.min(last3,Math.min(last1,last2));
    }
}
