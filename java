Daily Question Day 1 Minimum distance between three equal element
class Solution {
    public int sum(int key, HashMap<Integer, Integer> index) {
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i : index.keySet()) {
            if (index.get(i) == key) {
                sum.add(i);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0; i<=sum.size()-3; i++){
            min=Math.min(min,(Math.abs(sum.get(i) - sum.get(i+1)) +
               Math.abs(sum.get(i+1) - sum.get(i+2)) +
               Math.abs(sum.get(i) - sum.get(i+2))));
        }
        return min;
    }
    public int minimumDistance(int[] nums) {
        HashMap<Integer, Integer> fre = new HashMap<>();
        HashMap<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            index.put(i, nums[i]);
            fre.put(nums[i], fre.getOrDefault(nums[i], 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (int key : fre.keySet()) {
            if (fre.get(key) >= 3) {
                min = Math.min(min, sum(key, index)); 
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
