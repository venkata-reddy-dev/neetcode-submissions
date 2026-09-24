class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxCount = 0;
        int consecutiveCount=0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                consecutiveCount=0;
            }else{
                consecutiveCount++;
                if(maxCount<consecutiveCount){
                maxCount=consecutiveCount;
            }
            }
           
        }
        return maxCount;
    }
}