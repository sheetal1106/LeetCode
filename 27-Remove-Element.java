class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0; i <= nums.length-1; i++) {
            if (nums[i] != val){
                int temp = nums[i];
                nums[j] = nums[i];
                j++;
                
            }
            
        }
       return j;
    }
}