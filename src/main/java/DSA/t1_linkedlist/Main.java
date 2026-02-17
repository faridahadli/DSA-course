package DSA.t1_linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList("1");
        System.out.println("----------");
        LL.printList();
        System.out.println("----------");
        LL.append("2");
        LL.printList();

        System.out.println("----------");

        LL.removeLast();
        LL.printList();
        System.out.println("----------");

        LL.removeLast();
        LL.printList();

        System.out.println("head: " + LL.getHead() + " Tail: " + LL.getTail());

        System.out.println("----------");

        LL.prepend("0");
        LL.prepend("-1");
        LL.printList();

        System.out.println("----------");

        System.out.println(LL.get(0).value);
        System.out.println(LL.get(1).value);
        System.out.println(LL.get(3));

    }
}
