package DSA.t7_heaps;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> heap;

    private int leftChild(int index){
        return 2*index + 1;
    }

    private int rightChild(int index){
        return 2*index + 2;
    }

    private int parent(int index){
        return (index-1)/2;
    }

    private void swap(int index1, int index2){
       int temp = heap.get(index1);
       heap.set(index1, heap.get(index2));
       heap.set(index2, temp);
    }


}
