class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res= new ArrayList<>();
        Set<List<Integer>> pair= new LinkedHashSet<>();
        Arrays.sort(nums);
        int size=nums.length;
        for(int i=0;i<size;i++){
            if(i>0 && nums[i]==nums[i-1])
                     continue;
            for(int j=i+1;j<size;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])
                     continue;
                
                int num= target-nums[j];
                int k=j+1; int l=size-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    
                    if(sum==target){
                        List<Integer> data= new ArrayList<>();
                        data.add(nums[i]);
                        data.add(nums[j]);
                        data.add(nums[k]);
                        data.add(nums[l]);
                        if(pair.add(data)){
                            res.add(data);
                        }
                        k++;
                        l--;

                        if(k<l && nums[k]==nums[k-1]){
                             k++;
                         }

                    }else if(sum>target){
                        l--;
                    }else{
                        k++;
                    }
                }
            }
        }

        return res;
    }
}