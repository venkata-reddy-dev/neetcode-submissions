class Solution {
    public void sortColors(int[] nums) {

        int l = 0;
        int r = nums.length-1;
        int index = 0;

        for(;index<=r;){

            if(nums[index]==0){
                swap(nums,l,index);
                l++;
                index++;
            }else if(nums[index]==2){
                swap(nums,r,index);
                r--;
            }else{
                index++;
            }
        }
           
    }

    public void swap(int[] array, int a,int b){
        var temp= array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}