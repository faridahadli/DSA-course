package DSA.t7_heaps;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> heap = new ArrayList<>();

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

    public void insert(int i){
        heap.add(i);
        int current_index = heap.size() - 1;
        while(current_index>0 && heap.get(current_index) > heap.get(parent(current_index))){
                swap(current_index,parent(current_index));
                current_index = parent(current_index);
        }
    }

    public void sinkDown(int curr_index){
        int max_index = curr_index;
        while (curr_index<heap.size()-1){
           if(leftChild(curr_index)<heap.size()&&heap.get(leftChild(curr_index))>heap.get(max_index)){
               max_index = leftChild(curr_index);
           }

           if(rightChild(curr_index)<heap.size()-1 && heap.get(rightChild(curr_index))> heap.get(max_index)){
               max_index = rightChild(curr_index);
           }

            if (heap.get(curr_index)<heap.get(max_index)){
                swap(curr_index,max_index);
                curr_index = max_index;
            }else{
                break;
            }
        }
    }

    public Integer remove(){
        if(heap.isEmpty()) return null;
        swap(0,heap.size()-1);
        int out =  heap.removeLast();
        sinkDown(0);
        return out;
    }

}
