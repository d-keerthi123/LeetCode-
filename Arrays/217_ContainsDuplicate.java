//Time Complexity O(n log n)
//Space Complexity O(log n) due to sorting recursion

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //sort array
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
