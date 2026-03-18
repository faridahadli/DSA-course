package DSA.t9_basic_sorts;

public class InsertionSort {

    public static void insertionSort(int [] array){
        for(int i = 1; i<array.length;i++){
            int temp = array[i];
            for(int j = i-1;j > -1;j-- ){
                if(temp<array[j]){
                    array[j+1] = array[j];
                    array[j]=temp;
                }
            }
        }
    }

    public static void insertionSortBest(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            // Shift elements of array[0..i-1] that are greater than temp
            // to one position ahead of their current position
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            // Place temp in its correct sorted position
            array[j + 1] = temp;
        }
    }

}
