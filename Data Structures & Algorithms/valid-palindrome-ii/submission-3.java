class Solution {
    public boolean validPalindrome(String s) {
        var c = s.toCharArray();

        var l=0; var r=c.length-1;

        boolean isDeletedLeft = false;
        boolean isDeletedRight = false;

        for(;l<=r;){

            if(!isAphaNumeric(c[l])){
                l++;
                continue;
            }

             if(!isAphaNumeric(c[r])){
                r--;
                continue;
            }

            if(c[l]!=c[r]){
                if(isDeletedLeft && isDeletedRight){
                return false;
                }else{
                    if(!isDeletedLeft){
                        l++;
                        isDeletedLeft = true;
                        continue;
                    }

                    if(!isDeletedRight){
                        r--;
                        l--;
                        isDeletedRight = true;
                        continue;
                    }
                  
                   
                }
                
            }
            l++; r--;
        }

        return true;
    }

    boolean isAphaNumeric(char c){
        return (c>='a' && c<='z') || (c>='0'&& c<='9');
    }
}