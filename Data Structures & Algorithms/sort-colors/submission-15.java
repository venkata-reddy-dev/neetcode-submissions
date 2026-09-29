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
           }else if(k == 2){
            nums[index] = nums[r];
            nums[r] = k;
            r--;
            if(nums[index]==1){
                index++;
            }
           }else{
            nums[index] = nums[r];
            nums[r] = k;
            if(nums[index]==1){
                index++;
            }
           }

        }
    }
    /*
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
    }*/
}