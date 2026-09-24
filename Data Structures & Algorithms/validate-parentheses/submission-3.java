class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
          return false;
        }

        java.util.Stack<String> startStack= new java.util.Stack<String>();

        for (int i=0; i<s.length();i++){
            String a=s.substring(i,i+1);
            if(a.equals("(")||a.equals("{")||a.equals("[")){
                startStack.push(a);
            }else{

                if(startStack.size()==0){
                    return false;
                }

                String b=startStack.peek();

                if(a.equals(")")&&b.equals("(")){
                    startStack.pop();
                }else if(a.equals("]")&&b.equals("[")){
                    startStack.pop();
                }else if(a.equals("}")&&b.equals("{")){
                    startStack.pop();
                }else{
                    return false;
                }
            }
        }
        System.out.println("stack is : "+startStack);
        return startStack.size()==0;
    }
}
