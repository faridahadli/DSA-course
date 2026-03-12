package DSA.t4_trees;

public class BinarySerachTree {
    public Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node node = new Node(value);
        if(root == null){
            root = node;
            return true;
        }
        Node temp = root;
        while (true){
            if(temp.value> node.value){

                if(temp.left == null){
                    temp.left = node;
                    return true;
                }
                temp = temp.left;
            } else if (temp.value < node.value) {
                if(temp.right == null){
                    temp.right = node;
                    return true;
                }
                temp = temp.right;
            }else {
                return false;
            }
        }
    }

    public boolean contains(int value){
        if(root == null) return false;
        Node temp = root;
        while (temp!=null){
            if(temp.value == value) return true;
            if(temp.value>value){
                temp = temp.left;
            }else {
                temp = temp.right;
            }

        }
        return false;
    }



}

