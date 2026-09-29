class Solution {
    public void sortColors(int[] nums) {
        
        var zeroCount = 0;
        var oneCount = 0;
        var twoCount = 0;

        for(var num: nums){
            if(num==0){
                zeroCount++;
            }else  if(num==1){
                oneCount++;
            }else  if(num==2){
                twoCount++;
            }
        }

        int i = 0;
        int t = zeroCount ;
        while (t>0){
            nums[i] = 0;
            i++;
            t--;
        }
         t = oneCount ;
        while (t>0){
            nums[i] = 1;
            i++;
            t--;
        }
         t = twoCount ;
        while (t>0){
            nums[i] = 2;
            i++;
            t--;
        }
    }
}