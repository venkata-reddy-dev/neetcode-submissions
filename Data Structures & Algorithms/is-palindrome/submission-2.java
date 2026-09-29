class Solution {
    public boolean isPalindrome(String s) {
        var c = s.toLowerCase().replace(" ","").toCharArray();

        var l = 0; var r = c.length-1;

        for(;l<=r;){

    
            if(!isAlphaNemeric(c[l])){
                l++;
                continue;
            }

            if(!isAlphaNemeric(c[r])){
                r--;
                continue;
            }
            
            if(c[l]!=c[r]){
                return false;
            }
            l++; r--;
        }
        return true;
       
    }

    public boolean isAlphaNemeric(char c){
      return (c>='a' && c<='z' ) || (c>='0' && c<='9');
    }
}
