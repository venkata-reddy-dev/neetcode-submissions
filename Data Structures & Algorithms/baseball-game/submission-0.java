class Solution {
    public int calPoints(String[] operations) {
        java.util.Stack<Integer> scoreList = new java.util.Stack<Integer>();

        for(int i=0; i<operations.length;i++){
           String operation = operations[i];
           System.out.println("operation is "+operation);
            if(operation.equals("+") ){
                int size = scoreList.size();
                int value= (size>0?scoreList.get(size-1):0) + (size>1?scoreList.get(size-2):0);
              scoreList.push(value);
              System.out.println("operation inside "+operation);
            }else if(operation .equals("C") ){
                scoreList.pop();
                System.out.println("operation inside "+operation);
            }else if(operation .equals("D") ){
             scoreList.push(scoreList.peek()*2);
             System.out.println("operation inside "+operation);
            }else {
                scoreList.push(Integer.parseInt(operation));
                System.out.println("operation inside else "+operation);
            }
        }
        
        int totalPoints = 0; 
        for(int i=0; i<scoreList.size();i++){
            totalPoints = totalPoints + scoreList.get(i);
        }

        return totalPoints;

    }
}