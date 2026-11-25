class Solution {
    public String[] wordSubsets(String[] words1, String[] words2) {

        var outList = new ArrayList<String>();

        
        var word1List= new ArrayList<Map<String,Integer>>();
        var word2List= new ArrayList<Map<String,Integer>>();
        
        for(var w: words1){
            word1List.add(charMap(w));
        }

        for(var w: words2){
            word2List.add(charMap(w));
        }

        // filter
        // word1 data loop
        int i=0;
        for(var word1Data:word1List){

            // flag
            var isFailed = false;

            for(var word2Data : word2List){
                // word2 chars should present in word 1
                //System.out.println("validation combo: word2Data "+word2Data+" word1Data: "+word1Data);
                for(var key : word2Data.keySet()){
                    if(word1Data.get(key)==null){
                        isFailed = true;
                        //System.out.println("v1");
                        break;
                    }
                    if(word2Data.get(key)>word1Data.get(key)){
                        isFailed = true;
                        //System.out.println("v2");
                        break;
                    }
                }
            }
            //System.out.println("v3 isFailed: "+isFailed+ " outList: "+outList);
            // check and add to out list
            if((!isFailed)&& (!outList.contains(words1[i]))){
                outList.add(words1[i]);
            }
            i++;
        }

        String[] out = new String[outList.size()];
        for(int k=0;k<outList.size();k++){
            out[k]=outList.get(k);
        }

        return out;


    }

    Map<String,Integer> charMap(String w){
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<w.length(); i++){
            var ch=w.substring(i,i+1);
            map.putIfAbsent(ch,0);
            map.put(ch,map.get(ch)+1);
        }
        return map;
    }
}


