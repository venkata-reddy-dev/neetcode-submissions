class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }

        var l = 1;
        var r = l;

       for(;r<nums.length;){
        if(nums[l-1]!=nums[r]){
            nums[l] = nums[r];
            l++;   
        }
        r++;
       }
        return l; 
    }

   
}