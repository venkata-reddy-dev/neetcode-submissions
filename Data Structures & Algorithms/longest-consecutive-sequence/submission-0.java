class Solution {
    public int longestConsecutive(int[] nums) {
        
        var set= new HashSet<Integer>();
        for(int n: nums){
            set.add(n);
        }

        
        var longestSet=0;
        
        for(int n: set){

            var setCount=0;
            var isStartOfSet= !set.contains(n-1);

            if(isStartOfSet){
                setCount++;
                while(set.contains(n+setCount)){
                    setCount++;
                }
            }

            longestSet = longestSet<setCount?setCount:longestSet;

        }

        return longestSet;
    }
}
