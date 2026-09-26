class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] m = new int[2];
        int[] count = new int[nums.length + 1];
        for(int i : nums){
            count[i]++;
        }

        for(int i = 1; i <= nums.length; i++){
            if(count[i] == 2){
                m[0] = i;
            }else if(count[i] == 0){
                m[1] = i;
            }
        }
        return m;
    }
}