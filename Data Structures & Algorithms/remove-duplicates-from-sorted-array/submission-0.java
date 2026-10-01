class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }

        var l = 1;
        var r = nums.length - 1;

        var k = 1;
        var p = nums[0];

        for(;l<=r;){
            if(nums[l] == p){
                leftShift(nums,l,r,nums[l]);
                r--;
            }else{
                p = nums[l];
                k++;
                l++;
            }
            
        }

        return k; 
    }

    public void leftShift(int[] array, int start,int end,int item){
            
            var p=item;
            for(int i=end;i>=start;i--){
                var temp = array[i];
                array[i] = p;
                p = temp;
            }
    }
}