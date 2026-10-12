
class Solution {
    public int findMin(int[] nums) {
        // {1,2,3,4,5,6}

        var l=0; 
        var r=nums.length-1;

        var out = nums[0];

        while(l<=r){

        if(nums[l]<=nums[r]){
            out = Math.min(out, nums[l]);
            return out;
        }

        var m = (l+r)/2;
        out = nums[m]<out ? nums[m] :out;

        if(nums[m]>=nums[l]){
            // eliminate left
            l = m+1;
        }else{
            // eliminate right
            r=m-1;
        }

        }

        return out;
       
    }
}
