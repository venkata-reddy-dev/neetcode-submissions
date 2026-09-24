class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<String,Integer> sMap=new HashMap();
        Map<String,Integer> tMap=new HashMap();

        for(int i=0; i<s.length();i++){
            
            String sChar = String.valueOf(s.charAt(i));
            String tChar = String.valueOf(t.charAt(i));

            if(sMap.containsKey(sChar)){
                sMap.put(sChar,sMap.get(sChar)+1);
            }else{
                sMap.put(sChar,1);
            }

            if(tMap.containsKey(tChar)){
                tMap.put(tChar,tMap.get(tChar)+1);
            }else{
                tMap.put(tChar,1);
            }
        }

        if(sMap.size()!=tMap.size()){
            return false;
        }

        for(String key: sMap.keySet()){
            if(!sMap.get(key).equals(tMap.get(key))){
                return false;
            }
        }

        return true;

    }
}
