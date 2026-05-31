class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass=mass;
        for(int val:asteroids){
            if(val>currMass) return false;
            currMass+=val;
        }
        return true;
    }
}
