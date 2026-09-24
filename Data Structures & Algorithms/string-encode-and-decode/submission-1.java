class Solution {

    public String encode(List<String> strs) {
        
        String s="";
        for(int i=0; i<strs.size(); i++){
            s = s + (strs.get(i).length()) + "#"+ (strs.get(i));
        }
        return s;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();

        if(str.isEmpty()){
            return output;
        }
            
        var a = str.toCharArray();

        int numIndex=0;
           
        while(numIndex<a.length){

            var numLength = 0;
            int start = numIndex;
            while(numIndex<=(a.length-1)){
                var c= a[numIndex];
                if(Character.isDigit(c)){
                    numLength++;
                    numIndex++;
                }else if(c == '#'){
                    break;
                }
            }

            var numCharArray=Arrays.copyOfRange(a,start,start+numLength);
            
            var strLength=Integer.parseInt(new String(numCharArray));

            numIndex++; // Skip the '#'
            var strArray=Arrays.copyOfRange(a,numIndex,numIndex+strLength);
            output.add(new String(strArray));
            numIndex=numIndex+strLength;

        }

        return output;
    }
}