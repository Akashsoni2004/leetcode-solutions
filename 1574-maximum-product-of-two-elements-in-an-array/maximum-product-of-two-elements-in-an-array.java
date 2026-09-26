class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length-1;
        int j = i-1;
        int res = (nums[i]-1)*(nums[j]-1);
        return res;
    }
}