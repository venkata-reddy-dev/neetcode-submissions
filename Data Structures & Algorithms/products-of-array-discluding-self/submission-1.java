class Solution {
    public int[] productExceptSelf(int[] nums) {
        var output = new int[nums.length];
        var zeroCount = 0;

        var totalProduct=1;
        for(int i=0; i<nums.length;i++){

            if(nums[i]==0){
                zeroCount++;
                continue;
            }
            totalProduct = totalProduct * nums[i];
        }

        for(int i=0; i<nums.length;i++){
            
            if(nums[i]==0 && zeroCount>1){
                output[i]= 0;
            }else if(nums[i]==0 && zeroCount==1){
                output[i]= totalProduct;
            }else if (zeroCount>0){
                output[i]= 0;
            }else{
                output[i]= totalProduct/nums[i];
            }
        }



        return output;
    }
}  
