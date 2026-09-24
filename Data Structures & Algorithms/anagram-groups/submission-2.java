class Solution {
    // hash-map way
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();

        for(int i =0; i<strs.length; i++){
            var key = sortString(strs[i]);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(strs[i]);
        }

        return  new ArrayList<>(map.values());

    
    }

    public String sortString(String s){
            var charArray= s.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
    }

}