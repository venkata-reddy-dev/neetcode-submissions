
class Solution {
    public int findMin(int[] nums) {
        // {3,4,5,6,1,2}
        var l = 0;
        var r = nums.length-1;
        var m = r/2;

        var minValue = nums[m];

       while(l<r){

        if(r-l==1){
            var tempMinValue = nums[r]<nums[l]?nums[r]:nums[l];
            minValue = tempMinValue < minValue ? tempMinValue : minValue;
            break;
        }

//System.out.println("l is :"+l+" and r is :"+r);
        if(nums[l]<nums[m] && nums[m]<nums[r]){
            minValue = nums[m] < minValue ? nums[m] : minValue;
            // eliminate right side half
            r=m;
            m=l+((r-l)/2);
        }else if(nums[l]>nums[m]){
            minValue = nums[m] < minValue ? nums[m] : minValue;
            // eliminate right side half
            r=m;
            m=l+((r-l)/2);
        }else if(nums[m]>nums[r]){
            minValue = nums[m] < minValue ? nums[m] : minValue;
            // eliminate left side half
            l=m;
            m=l+((r-l)/2);
        }
       }

       return minValue;
    }
}
