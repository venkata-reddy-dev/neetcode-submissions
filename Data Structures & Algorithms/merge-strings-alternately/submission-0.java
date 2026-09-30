class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        var l=0; var lMax=word1.length()-1;
        var r=0; var rMax=word2.length()-1;

        var array = new char[lMax+1+rMax+1];
        var i = 0;

        while(l<=lMax && r<=rMax){
            array[i] = word1.charAt(l);
            i++;
            array[i] = word2.charAt(r);
            i++;
            l++;
            r++;
        }

        if(l>lMax && r<=rMax){
            fillArray(word2,r,rMax+1,array,i);
        }

        if(r>rMax && l<=lMax){
            fillArray(word1,l,lMax+1,array,i);
        }

        return new String(array);
    }

    public void fillArray(String s,int start,int end,char[] array,int arrayIndex){
        var subArray = s.substring(start,end).toCharArray();

        for(var item: subArray){
            array[arrayIndex] = item;
            arrayIndex++;
        }
    }
}