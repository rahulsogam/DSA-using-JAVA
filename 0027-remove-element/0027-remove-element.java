class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;

        for(int i=1;i<=nums.length;i++){
            if(nums[i-1]!=val){
                nums[j]=nums[i-1];
                j++;
            }
        }
        return j;
    }
}