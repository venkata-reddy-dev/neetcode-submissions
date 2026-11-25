class Solution {
    public boolean isDecomposable(String s) {


        var list = new ArrayList<String>();

        var l =0;
        var r =1;

        var ch = s.charAt(l);
        
        while(r<s.length()){
            var c = s.charAt(r);
            if(c==ch && r-l<3){
                r++;
            }else{
                // split
                list.add(s.substring(l,r));
                l=r;
                ch = s.charAt(l);
                r++;
                
            }
        }
       list.add(s.substring(l,r));

        //System.out.println(list);

        var withSize2=false;
        var withSize3=false;
        for(var k : list){

            if(k.length()==2){
                if(k.length()==2 && withSize2==false){
                    withSize2 = true;
                }else if (k.length()==2 && withSize2==true){
                        return false;
                }
            }else if(k.length()==3 ){
                withSize3 = true;
            }else{
                return false;
            }
            
        }

        return withSize2;
    }
}
