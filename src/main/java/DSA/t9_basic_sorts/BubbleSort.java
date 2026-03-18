package DSA.t9_basic_sorts;

public class BubbleSort {

    public static void bubbleSort(int[] array){
        int leftIndex;
        int rightIndex;
        int temp;
        for(int i = 0; i<array.length-1; i++){
            leftIndex = i;rightIndex = leftIndex+1;
            for(int j = i; j<array.length-1;j++){
                temp = array[leftIndex];
                if(temp>array[rightIndex]){
                    array[leftIndex] = array[rightIndex];
                    array[rightIndex] = temp;
                }
                leftIndex++;rightIndex++;
            }
        }
    }

}
