class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = 0, m = 0;
        for(int i : nums){
            n = (i == 0) ? 0 : (n + 1);
            if(m < n){
                m = n;
            }
        }
        return m;

    }
}