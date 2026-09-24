class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int[] array =map.values().stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(array);
        
        int[] output = new int[k];

        int x=0;
        
        for(int i = array.length-1; i>array.length-k-1;i--){
            
            for(var entry: map.entrySet()){
                if(entry.getValue()!=null && entry.getValue().equals(array[i])){
                    output[x]=entry.getKey();
                    map.put(entry.getKey(),null);
                    x++;
                }
            }
        }



        return output;
    }
}
