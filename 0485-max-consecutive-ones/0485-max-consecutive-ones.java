class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {


        int current_count = 0;
        int max_ans = 0;
        int n = nums.length;

        for(int j =0;j<n;j++)
        {
            if(nums[j]==1)
            {
                
                current_count++;
            }
            else {
                max_ans =  Math.max(max_ans,current_count);
                current_count = 0;
            }
           
        }
        return Math.max(max_ans,current_count);
        
    }
}