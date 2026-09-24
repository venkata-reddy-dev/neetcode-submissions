class DynamicArray {

int[] array;
int dynamicArrayLength=0;
    public DynamicArray(int capacity) {
array=new int[capacity];
    }

    public int get(int i) {
return array[i];
    }

    public void set(int i, int n) {
array[i]=n;
    }

    public void pushback(int n) {
        if(getSize()==getCapacity()){
            resize();
        }
   dynamicArrayLength=dynamicArrayLength+1;
   array[dynamicArrayLength-1]=n;
    }

    public int popback() {
        dynamicArrayLength=dynamicArrayLength-1;
   return array[dynamicArrayLength];
    }

    private void resize() {
        int[] temp = array;
        array = new int[temp.length*2];
        for(int i =0;i<temp.length;i++){
            array[i]=temp[i];
        }
    }

    public int getSize() {
return dynamicArrayLength;
    }

    public int getCapacity() {
return array.length;
    }
}
