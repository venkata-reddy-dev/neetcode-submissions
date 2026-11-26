class Solution {
    public int strStr(String haystack, String needle) {
        
        var l=0;

        var i=0;

        while(l<haystack.length()){
            if(haystack.charAt(l)==needle.charAt(i)){
                l++;
                i++;
                if(i<needle.length()){

                }else{
                    // word ends
                    return l-(needle.length());
                }
            }else{
                l=l-i+1;
                i=0;
                
            }
        }
        return -1;
    }
}