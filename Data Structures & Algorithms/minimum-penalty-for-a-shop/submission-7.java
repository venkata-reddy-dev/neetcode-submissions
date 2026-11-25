class Solution {
    public int bestClosingTime(String customers) {

        var cp=0;

        for(int i=0; i<customers.length();i++){
            cp = cp + calPenalty(customers.substring(i,i+1),false);
        }

        //System.out.println("cp: "+cp);

       var outHour=0;
       var outPenalty=cp;


       var h=1;
       var temp=0;

       while(h<=customers.length()){
            var ch = customers.substring(h-1,h-1+1);
            var p = calPenalty(ch,true);
            var tp = p==1?-1:1;
            var pen =cp - (temp+tp);
            temp = temp+tp;

            //System.out.println(" h:"+h+"pen :"+pen+" temp:"+temp);

            if(outPenalty>pen){
                outPenalty=pen;
                outHour=h;
            }
            h++;
       }

        return outHour;
    }

    int calPenalty(String cStatus,boolean isShopOpened){
        return isShopOpened ? (cStatus.equals("N")?1:0):(cStatus.equals("Y")?1:0);
    }
}