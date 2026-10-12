class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()==0){
            return 0;
        }

        if(s.length()==1){
            return 1;
        }

        var set = new HashSet<String>();

        set.add(s.substring(0,1));

        var l=0;
        var r=1;

        var max=0;

        

        while(l<=r && r<s.length()){
            var sub = s.substring(r,r+1);
            while(set.contains(sub)){
                set.remove(s.substring(l,l+1));
                l++;
            }
            set.add(sub);
            max = Math.max(max,r-l+1);
            r++;
        }

        return max;
    }
}
