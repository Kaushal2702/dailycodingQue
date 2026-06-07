class Solution {
    public List<String> generateValidStrings(int n, int k) {
        ArrayList<String> al=new ArrayList<>();
        int total=(int)Math.pow(2,n);
        for(int i=0;i<total;i++){
            String binary=Integer.toBinaryString(i);
            String padding=String.format("%"+n+"s",binary).replace(' ','0');
            int cost=0;
            boolean valid=true;
            for(int j=0;j<n;j++){
                if(padding.charAt(j)=='1'){
                    cost+=j;
                    if(j>0 && padding.charAt(j-1)=='1'){
                        valid=false;
                        break;
                    }
                }
            }
            if(valid && cost<=k){
                al.add(padding);
            }
        }
        return al;
        
    }
    
}
