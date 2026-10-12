class Solution {
    public int search(int[] nums, int target) {
        
        var l=0;
        var r=nums.length-1;

        while(l<=r){

            var m = (l+r)/2;

            if(nums[m]==target){
                return m;
            }

            if(nums[l]<=nums[m]){
                if(nums[l] <= target && target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }else{
                if(nums[m] < target && target <= nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }

        return -1;
    }
}