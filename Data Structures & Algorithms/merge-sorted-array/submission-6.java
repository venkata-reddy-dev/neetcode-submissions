class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       
       var l=m-1;
       var r=nums2.length-1;
       var i=nums1.length-1;

       for(;r>=0 && l>=0;){

            if(nums2[r]>nums1[l]){
                nums1[i] = nums2[r];
                r--;
                
            }else{
                nums1[i] = nums1[l];
                l--;
            }
            i--;
       }

       while(r>=0){
        nums1[i] = nums2[r];
        r--;
        i--;
       }

    }

    
}