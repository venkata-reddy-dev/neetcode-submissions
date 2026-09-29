class Solution {
    public void sortColors(int[] nums) {

        int l = 0;
        int r = nums.length-1;

        int index = 0;

        while( (l<r) && index<=r){

           var k = nums[index];

           if(k==0 && l==index){
            index++;
            continue;
           }

           if(k == 0){
            nums[index] = nums[l];
            nums[l] = k;
            l++;
           }else{
            nums[index] = nums[r];
            nums[r] = k;
            if(k==2){
                r--;
            }
            
            if(nums[index]==1){
                index++;
            }
           }

        }
    }
}