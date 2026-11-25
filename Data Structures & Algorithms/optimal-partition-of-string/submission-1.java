class Solution {
    public int partitionString(String s) {

        var n = 1;

        var set = new HashSet<String>();
        var r = 0;

        while(r<s.length()){

            var ch = s.substring(r,r+1);
            if(set.contains(ch)){
                n++;
                //System.out.println(set);
                set.clear();
            }else{
                set.add(ch);
                r++;
            }
            
        }
    return n;

    }
}
