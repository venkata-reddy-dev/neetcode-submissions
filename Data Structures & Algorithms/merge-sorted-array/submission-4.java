class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        var l=0; var r=0;

        for(;r<nums2.length &&l<nums1.length;){
            if(nums2[r]<nums1[l]|| m==0){
                rightShift(nums1,nums2[r],l);
                r++;
                l++;
            }else{
                if(l>=(m+r)){
                    nums1[l] = nums2[r];
                    //rightShift(nums1,nums2[r],l);
                    r++;
                }
                l++;
            }
        }
    }

    void rightShift(int[] array,int item,int startIndex){

        var temp = item;
        for(int i=startIndex; i<array.length; i++ ){
            var t = array[i];
            array[i] = temp;
            temp = t;
        }
    }
}