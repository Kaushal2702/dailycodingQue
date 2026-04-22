class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> al=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            String qu=queries[i];
            for(int j=0;j<dictionary.length;j++){
                 String dic=dictionary[j];
                 int count=0;
                 for(int k=0;k<qu.length();k++){
                        if(qu.charAt(k)!=dic.charAt(k)){
                            count++;
                        }
                        if(count>2) break;     
                 }
                 if(count<=2){
                    al.add(qu);
                    break;
                } 
            }
        }
        return al;
    }
}
