// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {

  List<List<Pair>> output= new ArrayList<List<Pair>>();
     for (int i=0; i<pairs.size(); i++){
            int j=i-1;

            Pair pair=pairs.get(i);

            while(j>=0 && pair.key<pairs.get(j).key){
                pairs.set(j+1,pairs.get(j));
                j--;
            }
            pairs.set(j+1,pair);
            output.add(new ArrayList<>(pairs));
     }

    return output;


    }
}
