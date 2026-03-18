package DSA.t9_basic_sorts;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int minIdx;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            minIdx = i;
            for (int j = i; j < array.length; j++) {
                minIdx = array[minIdx] < array[j] ? minIdx : j;
            }
            temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
    }
}
