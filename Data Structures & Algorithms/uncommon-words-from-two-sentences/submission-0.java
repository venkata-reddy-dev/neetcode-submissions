class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        var set = new HashSet<String>();
        var commonSet = new HashSet<String>();

        var s1Array=s1.split(" ");
        var s2Array=s2.split(" ");

        for(int i=0; i<s1Array.length;i++){
            var w=s1Array[i];
            if(commonSet.contains(w)){
                continue;
            }
            if(set.contains(w)){
                commonSet.add(w);
                set.remove(w);
            }else{
                set.add(w);
            }
        }

        for(int i=0; i<s2Array.length;i++){
            var w=s2Array[i];
            if(commonSet.contains(w)){
                continue;
            }
            if(set.contains(w)){
                commonSet.add(w);
                set.remove(w);
            }else{
                set.add(w);
            }
        }

        return set.toArray(new String[0]);
    }
}
