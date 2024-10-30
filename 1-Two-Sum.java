class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int itr1 = 0; itr1 < nums.length-1; itr1++) {
            for(int itr2 = itr1 + 1; itr2 < nums.length; itr2++) {
                if(nums[itr1] + nums[itr2] == target) {
                    return new int[]{itr1, itr2};
                }
            }
        }
        return null;
    }
}