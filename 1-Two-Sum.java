class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nums1 = new int[]{0,1};
        for(int i = 0; i < nums.length-1; i++) {
            for(int j=i+1; j < nums.length; j++) {
            int sum = nums[i] + nums[j];
            if( sum == target) {
                nums1[0] = i;
                nums1[1] = j;
               break;
            } 
            }
        }
        
        return nums1;
    }
}
