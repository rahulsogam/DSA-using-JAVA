class Solution {
    public void nextPermutation(int[] nums) 
    {
        int size= nums.length;
        int pivot= -1;
        for(int i=size-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                    pivot=i;
                    break;
            }
            
            
        }

        if(pivot==-1){
             Arrays.sort(nums);
             return;
        }
        
        for(int i=size-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                int temp=nums[i];
                nums[i]=nums[pivot];
                nums[pivot]= temp;
                break;
            }
        }
        pivot++;
        int k=size-1;
        while(pivot<k){
            int temp=nums[pivot];
            nums[pivot]=nums[k];
            nums[k]= temp;
            pivot++;
            k--;
        }
    }
}