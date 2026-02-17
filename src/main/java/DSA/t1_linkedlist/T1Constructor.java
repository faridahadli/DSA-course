package DSA.t1_linkedlist;

public class T1Constructor {


}

class LinkedList{

    private Node head;
    private Node tail;
    private int length;

    public  LinkedList (String value){
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        length = 1;
    }
    class Node {
        String value;
        Node next;

        public Node( String value){
            this.value = value;
        }
    }

    public void append(String value){
        Node node = new Node(value);
        if(length == 0){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }


        length++;
    }

    public void printList(){
        if(head == null)
            System.out.println("LL is empty");
        Node node = head;
        while (node!=null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    public Node removeLast (){ // my implementation and tutorials impl differ
        if(length == 0) return null;
        Node node = head;
        Node rmvNode = tail;
        while(node!=null){
            if(node.next == tail){
                node.next = null;
                tail = node;
                length--;
                return rmvNode;
            }
            node = node.next;
        }
        head = null;
        tail = null;
        length --;
        return rmvNode;
    }

    public void prepend(String value){
        Node node = new Node(value);
        if(length == 0){
            head = node;
            tail = node;
        }else {
            node.next = head;
            head = node;
        }
        length++;

    }

    public Node removeFirst(){ // my implementation and tutorials impl differ
        Node prevHead = head;
        if (length == 0)
            return null;
        length--;
        if(length == 1){
            head = null;
            tail = null;
            return prevHead;
        }
        Node newHead = head.next;
        head.next = null;
        head = newHead;
        return prevHead;
    }


    public Node get (int index){
        if(index>=length || index<0){
            return null;
        }
        Node node = head;
        for(int i = 0; i<index;i++){
            node = node.next;
        }
        return node;
    }

    public boolean set(int index, String value){ // my implementation is different
        if(index>=length || index<0)
            return false;
        Node node = head;
        for(int i = 0; i<index;i++){
            node = node.next;
        }
        node.value = value;
        return true;
    }

    public boolean insert(int index, String value){
        if(index >= length)
        if(index == 0){

        }
        return false;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
}